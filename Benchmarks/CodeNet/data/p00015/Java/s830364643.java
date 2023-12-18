import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		for(int i=0; i<n; i++){

			String a = br.readLine();
			String b = br.readLine();

			BigInteger bg =new BigInteger(a).add(new BigInteger(b));
			if(String.valueOf(bg).length() >80){
				System.out.println("overflow");
			}else {
				System.out.println(bg);
			}

		}
	}



}