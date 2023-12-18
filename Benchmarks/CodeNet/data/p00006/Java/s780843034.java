import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] str = br.readLine().toCharArray();
		
		for(int i = str.length - 1; i >= 0; i--){
			System.out.print(str[i]);
		}
		System.out.print('\n');
	}

}
