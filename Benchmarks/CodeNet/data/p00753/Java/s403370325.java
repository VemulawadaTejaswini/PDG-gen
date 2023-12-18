
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author kumar1
 *
 */
public class ProblemA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			solve();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

	/**
	 * @throws IOException 
	 * 
	 */
	private static void solve() throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		//File file = new File("case.txt");
		ArrayList<Integer> list = new ArrayList<Integer>();
		BufferedReader in = new	BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s = in.readLine()) != null) {
			Scanner scan = new Scanner(s);
			int n = 0;
			while(scan.hasNextInt()) {
				n = scan.nextInt();
				list.add(n);
			}
			scan.close();
			if(n == 0)
				break;
		}
		in.close();
		//System.out.println(list);
		int max = 0;
		for(int x : list) {
			if(max < x) {
				max = x;
			}
		}
		
		// max * 2までの篩をつくる
		boolean[] arr = new boolean[max * 2 + 1];
		arr[0] = true;
		for(int i = 2; i < arr.length; i++) {
			if(arr[i] == true)
				continue;
			for(int j = 2; i * j < arr.length; j++) {
				arr[i * j] = true;
			}
		}
		//System.out.println("unko");
		
		// 個数を得る
		int[] ans = new int[list.size() - 1];
		for(int i=0; i < ans.length; i++) {
			ans[i] = getPrimeNum(arr, list.get(i) + 1, list.get(i) * 2);
		}
		
		// 出力
		for(int i=0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
	}

	/**
	 * @param arr
	 * @param i
	 * @param j
	 * @return
	 */
	private static int getPrimeNum(boolean[] arr, int i, int j) {
		// TODO 自動生成されたメソッド・スタブ
		int ret = 0;
		for(int k = i; k <= j; k++) {
			if(arr[k] == false) {
				ret++;
			}
		}
		return ret;
	}
	
	
	

}