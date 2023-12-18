import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str);

		for(int i=0; i<n; i++){
			String strA = br.readLine();
			BigInteger a = new BigInteger(strA);

			String strB = br.readLine();
			BigInteger b = new BigInteger(strB);

			if(strA.length() > 80 || strB.length() > 80){
				System.out.println("overflow");
			}else{
				System.out.println(a.add(b));
			}
		}

	}
}