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

		String s = temp[0]+temp[1]+temp[2];
		int i = Integer.valueOf(s);

		if (i%4==0){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}

	}
}
