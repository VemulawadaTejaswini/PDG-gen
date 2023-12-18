import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String ans ="A";

		String str = "";
		while((str=br.readLine())!=null){

			String[] sp = str.split(",");

			if(ans.equals(sp[0])){
				ans = sp[1];
			} else if(ans.equals(sp[1])){
				ans = sp[0];
			}
		}
		System.out.println(ans);
	}
}