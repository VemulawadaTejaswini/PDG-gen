import java.util.Arrays;
import java.util.Scanner;


public class Main {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		final long a = sc.nextLong();
		final long b = sc.nextLong();
		final long c = sc.nextLong();
		
		int count = 0;
		for(long pos = a; pos <= b; pos++){
			if(c % pos == 0){
				count++;
			}
		}
		
		System.out.println(count);
		
	}
	
}