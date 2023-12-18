import java.io.BufferedReader;
import java.io.IOException;

public class Main {

	public BufferedReader br;

	/**
	 * メイン処理
	 * @throws IOException
	 */
	public void Proc() throws IOException {
		int itemCount = Integer.parseInt(br.readLine());
		String[] srcItems = new String[itemCount];
		srcItems = br.readLine().split(" ");

		String[] bubble = new String[itemCount];
		bubble = srcItems.clone();
		String[] selection = new String[itemCount];
		selection = srcItems.clone();

		/*
		 * BubbleSort(C)
			1 for i = 0 to C.length-1
			2     for j = C.length-1 downto i+1
			3         if C[j].value < C[j-1].value
			4             swap C[j] and C[j-1]
		 */

		for(int i=0; i<itemCount; i++) {
			for(int j=itemCount-1; j>=i+1; j--) {
				int num1 = Integer.parseInt(bubble[j].substring(1));
				int num2 = Integer.parseInt(bubble[j-1].substring(1));
				if(num1 < num2) {
					String buff = bubble[j];
					bubble[j] = bubble[j-1];
					bubble[j-1] = buff;
				}
			}
		}

		/*
		 * 7 SelectionSort(C, N)
			8   for i = 0 to N-1
			9     minj = i
			10    for j = i to N-1
			11      if C[j].value < C[minj].value
			12        minj = j
			13    C[i] と C[minj] を交換
		 */

		for(int i=0; i<itemCount;i++) {
			int minj = i;
			for(int j=i; j<itemCount; j++) {
				int num1 = Integer.parseInt(selection[j].substring(1));
				int num2 = Integer.parseInt(selection[minj].substring(1));
				if(num1 < num2) {
					minj = j;
				}
			}
			String buff = selection[i];
			selection[i] = selection[minj];
			selection[minj] = buff;
		}


		StringBuilder ans = new StringBuilder();
		for(String item:bubble) {
			if(ans.length() > 0) {
				ans.append(" ");
			}
			ans.append(item);
		}
		String bubbleAns = ans.toString();
		ans = new StringBuilder();
		for(String item:selection) {
			if(ans.length() > 0) {
				ans.append(" ");
			}
			ans.append(item);
		}
		String selectionAns = ans.toString();

		System.out.println(bubbleAns);
		System.out.println("Stable");
		System.out.println(selectionAns);
		System.out.println((bubbleAns.equals(selectionAns)?"S":"Not s") + "table");

	}


	public static void main(String[] args)  {
		Main mn = new Main();
		mn.br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		try {
			mn.Proc();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} finally {
			try {
				mn.br.close();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
	}


}