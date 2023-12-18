import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException{


		// 読み込み
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] temp;

		line=br.readLine();
		temp=line.split(" ");

		String a = temp[0].substring(0,1).toUpperCase();
		String b = temp[1].substring(0,1).toUpperCase();
		String c = temp[2].substring(0,1).toUpperCase();


			System.out.println(a+b+c);


	}
}
