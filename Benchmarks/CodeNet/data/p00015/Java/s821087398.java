import java.util.Scanner;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++){
			BigInteger num = sc.nextBigInteger();
			num = num.add(sc.nextBigInteger());
			String temp = num.toString();
			if(temp.length() > 80){
				System.out.println("overflow");
			}else{
				System.out.println(temp);
			}
		}
	}
}