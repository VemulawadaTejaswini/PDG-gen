import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main{
	
	private static int N;
	private static BigDecimal a, b,z;
	private final static int MAX_LEN=80;
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		
		for(int i=0;i<N;i++){
			a = new BigDecimal(br.readLine());
			b = new BigDecimal(br.readLine());
			z = a.add(b);
			
			if(String.valueOf(z).length()>MAX_LEN){
				System.out.println("overflow");
			}
			else {
				System.out.println(z);
			}
		}
	}
}