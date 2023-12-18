import java.math.BigInteger;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++){
			BigInteger x = sc.nextBigInteger();
			BigInteger y = sc.nextBigInteger();
			BigInteger sum = x.add(y);
			
			if (sum.toString().length()<=80) {
				System.out.println(sum);
			}
			else{
				System.out.println("overflow");
			}
		}
	}
}