import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String str = br.readLine();
			
			if(str == null){
				break;
			}
			
			String[] strArray = str.split(" ");
			int a = Integer.parseInt(strArray[0]);
			int b = Integer.parseInt(strArray[1]);
			int n = Integer.parseInt(strArray[2]);
			
			Decimal dc = new Decimal(a, b);
			
			System.out.println(dc.sumOfDecimal(n));
		}
	}

}

class Decimal{
	private int numerator;
	private int denominator;
	private int[] dplace = new int[101];
	
	public Decimal(int a, int b){
		numerator = a;
		denominator = b;
		
		initDplace();
	}
	
	private void initDplace(){
		int a = numerator;
		int b = denominator;
		for(int i = 1; i < dplace.length ; i++){
			dplace[i] = (a*10/b)%10;
			a = a*10%b;
		}
	}
	
	public int sumOfDecimal(int n){
		int result = 0;
		for(int i = 1; i <= n ; i++){
			result += dplace[i];
		}
		
		return result;
	}
	
	public void print(){
		for(int i = 1; i < dplace.length ; i++){
			System.out.print(dplace[i]);
		}
		System.out.println();
	}
}