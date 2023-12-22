import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s="";
		while((s=br.readLine())!=null){
			BigInteger bi=new BigInteger(s);
			int x=bi.intValue();
			for (int i = x-1; i>0; i--) {
				bi=bi.multiply(BigInteger.valueOf(i));
			}
			
			System.out.println(bi);
		}
	}
}