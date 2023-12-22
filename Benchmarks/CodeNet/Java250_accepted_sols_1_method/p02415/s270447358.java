import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		//文字列を入力
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		//文字列をカウント
		int n=str.length();
		//繰り返し
		for(int i=0;i<n;i++) {
			//strからi個目の文字を切り出す
			char a;
			a=str.charAt(i);
			//それぞれをif文にかけ、n文字目が大文字か小文字かを判断
			if(Character.isUpperCase(a)) {
				String c=String.valueOf(a);
				c=c.toLowerCase();
				System.out.print(c);
			}else {
				String c=String.valueOf(a);
				c=c.toUpperCase();
				System.out.print(c);
			}
		}
		System.out.println();
	}

}

