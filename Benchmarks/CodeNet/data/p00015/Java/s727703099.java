import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger a,b;
		final BigInteger max = new BigInteger("100000000000000000000000000000000000000000000000000000000000000000000000000000000");
		final BigInteger one = new BigInteger("1");
		
		final int loop;
		
		loop = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < loop; i++){
			
			a= new BigInteger(br.readLine());
			b= new BigInteger(br.readLine());
			
			if(a.divide(max).compareTo(one) >= 0 || a.divide(max).compareTo(one) >= 0){
				System.out.println("overflow");
				continue;
			}
			
			BigInteger sum = a.add(b);
			
			if(sum.divide(max).compareTo(one) >= 0){
				System.out.println("overflow");
				continue;
			}
			
			System.out.println(sum);
		}
	}
}