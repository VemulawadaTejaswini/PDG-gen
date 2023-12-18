import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BigInteger b = new BigInteger("1");
		for(int i = 1 ; i < 100; i++){
			b = b.multiply(new BigInteger(String.valueOf(i)));
			//System.out.println(i + " " + b);
			
		}
		Scanner cin = new Scanner(System.in);
		while(true){
			int n = cin.nextInt();
			if(n==0){
				break;
			}
			int count=0;
			for(int i = 5; i < 2000000000; i*=5){
				count+= n/i;
			}
			System.out.println(count);
				
			
			
		}
	}

}