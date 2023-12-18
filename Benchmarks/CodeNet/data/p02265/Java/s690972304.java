import java.io.BufferedReader;
import java.io.IOException;

public class Main {

	public BufferedReader br;

	/**
	 * メイン処理
	 * @throws IOException
	 */
	public void Proc() throws IOException {
		int commandCount = Integer.parseInt(br.readLine());
		long[] items = new long[Math.min(commandCount, (int)Math.pow(10, 6))+1];
		int itemCount = 0;
		for(int i=0; i<commandCount; i++) {
			String[] cmd = br.readLine().split(" ");
			long num = 0;
			if(cmd.length > 1) {
				num = Long.parseLong(cmd[1]);
			}
			if(cmd[0].equals("insert")) {
				for(int j=itemCount-1; j>=0; j--) {
					items[j+1] = items[j];
				}
				items[0] = num;
				itemCount++;
			} else if(cmd[0].equals("delete")) {
				boolean isMatch = false;
				for(int j=0; j<itemCount;j++) {
					if(items[j] == num) {
						isMatch = true;
					}
					if(isMatch) {
						items[j] = items[j+1];
					}
				}
				if(isMatch) {
					itemCount--;
				}
			} else if(cmd[0].equals("deleteFirst")) {
				for(int j=0; j<itemCount; j++) {
					items[j] = items[j+1];
				}
				itemCount--;
			} else {
				itemCount--;
			}
		}
		StringBuilder ans = new StringBuilder();
		for(int i=0; i<itemCount; i++) {
			if(ans.length() > 0) {
				ans.append(" ");
			}
			ans.append(items[i]);
		}
		System.out.println(ans.toString());
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