import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long sum = 1;
		long waru = (long)(Math.pow(10, 9)+7.0);		
		for(long i = 1;i <= n; i++)
		{
			sum = sum * i;
			sum = sum % waru;	
		}
		System.out.println((long)(sum%waru));
	}
}	
	