import java.io.*;

public class Main {
	public static void main(String args[]) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = in.readLine();
			if(str.equals("1")) {
				System.out.println("Hello World");
			}
			else if(str.equals("2")){
				String str1 = in.readLine();
				String str2 = in.readLine();
				System.out.println(Integer.valueOf(str1)+Integer.valueOf(str2) );
			}
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}
