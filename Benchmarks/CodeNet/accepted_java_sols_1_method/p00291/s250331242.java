import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		String str;
		while((str=br.readLine())!=null){
			String[] sp = str.split(" ");

			int total = 0;

			int a = Integer.parseInt(sp[0]);
			int b = Integer.parseInt(sp[1]);
			int c = Integer.parseInt(sp[2]);
			int d = Integer.parseInt(sp[3]);
			int e = Integer.parseInt(sp[4]);
			int f = Integer.parseInt(sp[5]);

			total = a * 1 + b * 5 + c * 10 + d * 50 + e * 100 + f * 500;

			if(total >= 1000){
				System.out.println(1);
			}else{
				System.out.println(0);
			}
		}
	}

}