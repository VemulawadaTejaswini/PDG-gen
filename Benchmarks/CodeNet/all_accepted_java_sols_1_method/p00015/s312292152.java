import java.math.BigInteger;
import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			BigInteger value = sc.nextBigInteger();
			BigInteger value_2 = sc.nextBigInteger();

			String s = ""+value.add(value_2);
			if(s.length() > 80){
				System.out.println("overflow");
			}else{
				System.out.println(s);
			}
		}
	}
}