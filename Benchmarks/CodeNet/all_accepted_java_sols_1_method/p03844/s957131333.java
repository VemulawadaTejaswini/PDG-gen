import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
	public static void main(String[] args) throws IOException{


		// 読み込み
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] temp;

		line=br.readLine();
		temp=line.split(" ");

		int a = Integer.valueOf(temp[0]);
		String op = temp[1];
		int b = Integer.valueOf(temp[2]);

		if(op.equals("+")){
			System.out.println(a+b);
		}else{
			System.out.println(a-b);
		}


	}
}
