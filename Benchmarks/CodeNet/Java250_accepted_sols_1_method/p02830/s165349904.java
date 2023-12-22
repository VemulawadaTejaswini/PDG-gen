import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		String b = br.readLine();
		String[] bArray = b.split(" ");
		String out = "" ;
		for(int i = 0 ; i < a ; i++) {
			out += bArray[0].substring(i, i+1);
			out += bArray[1].substring(i, i+1);
		}
		System.out.println(out);
	}

}
