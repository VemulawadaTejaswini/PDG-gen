import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args){
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s;
		try {
			s = new String(in.readLine());
			s = s.replaceAll(" ", "");
			int i = Integer.parseInt(s);
			String opt;
			if(i%4 == 0) opt = "YES";
			else opt = "NO";
			System.out.println(opt);
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}