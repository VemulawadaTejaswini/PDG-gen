import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		String str;
		if((str=br.readLine())!=null){
			String[] sp = str.split(" ");

			int a = Integer.parseInt(sp[0]);
			int b = Integer.parseInt(sp[1]);
			int c = Integer.parseInt(sp[2]);
			int d = Integer.parseInt(sp[3]);

			if(a == b && c == d){
				System.out.println("yes");
			} else if(a == c && b == d){
				System.out.println("yes");
			} else if(a == d && b == c){
				System.out.println("yes");
			} else{
				System.out.println("no");
			}
		}
	}

}