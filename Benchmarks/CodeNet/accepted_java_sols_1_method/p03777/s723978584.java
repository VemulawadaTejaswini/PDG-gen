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

		String a = temp[0];
		String b = temp[1];

		if (a.equals("H")){
			System.out.println(b);
		}else if(b.equals("H")){
			System.out.println("D");
		}else{
			System.out.println("H");
		}

	}
}
