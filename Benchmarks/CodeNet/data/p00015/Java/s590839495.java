import java.math.BigInteger;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		while(num > 0){
			BigInteger num_1 = sc.nextBigInteger();
			BigInteger num_2 = sc.nextBigInteger();
			BigInteger sum = num_1.add(num_2);
			
			if(sum.toString().length() > 80){
				System.out.println("overflow");
			}
			else {
				System.out.println(sum);
			}
			num--;
		}
	}
}