import java.util.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
      	BigInteger sum = BigInteger.valueOf(0);
		for(int i=1;i<=a;i++){
			if(i%3!=0&&i%5!=0) {
				sum=sum.add(BigInteger.valueOf(i));
			}
        }
      System.out.println(sum);
	}
}