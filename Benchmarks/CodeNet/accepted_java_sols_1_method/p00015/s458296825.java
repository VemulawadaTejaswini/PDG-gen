import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 0; i<N; i++){
				BigInteger sum = sc.nextBigInteger().add(sc.nextBigInteger());
					if(String.valueOf(sum).length() > 80){
						System.out.println("overflow");
					} else {
						System.out.println(sum);
					}
		}
		
	}
}