import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();

		while (!line.equals("0")) {
			int n = Integer.parseInt(line);
			
			double fact = factrial((double)n);
			System.out.println(fact);
			
			int amountZero = countZero(fact);
			
			System.out.println(amountZero);
			
			line = br.readLine();
		}		
	}

	/**
	 * ?????°???????°??????????????????°?????°??????
	 * 
	 * @param fact
	 * @return
	 */
	private static int countZero(double fact) {
		int zero=0;
		
		for(; fact%10==0; zero++){
			fact /= 10;
		}
		
		return (zero);
	}

	/**
	 * ??????????¨??????????
	 * 
	 * @param n
	 * @return
	 */
	private static double factrial(double n) {
		double dst = n;
		for(int i=(int)n-1; i>=2; i--){
			dst *= i;
		}
		return dst;
	}
}