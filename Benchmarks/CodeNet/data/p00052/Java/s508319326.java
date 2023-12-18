import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();

		while (!line.equals("0")) {
			int n = Integer.parseInt(line);
			
			int fact = factrial(n);
			
			int amountZero = countZero(fact);
			
			System.out.println(amountZero);
			
			line = br.readLine();
		}		

/*		int n = 20;
		int s = factrial(n);
		System.out.println("\n"+s);
*/
	}

	/**
	 * ?????°???????°??????????????????°?????°??????
	 * 
	 * @param fact
	 * @return
	 */
	private static int countZero(int fact) {
//	public int countZero(int fact){
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
	private static int factrial(int n) {
//	public int factrial(int n){
		int cntZero = 0;
		int thisZero = 0;
		int fact = 1;
		
		for(int i=n; i>1; i--){
			fact *= i;
			thisZero = countZero(fact);
			cntZero += thisZero;
			for(int j=0; j<thisZero; j++){
				fact /= 10;
			}
			fact %= 10;
//			System.out.println(i+ "   "+ fact+ "   "+ thisZero);
		}
		
		return (cntZero);
	}
}