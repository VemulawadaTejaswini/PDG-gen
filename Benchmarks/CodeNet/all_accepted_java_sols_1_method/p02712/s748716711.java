import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long N = input.nextLong();
		long sum=0;
		
		for(long i=0;i<=N;i++) {
			if(i%5!=0 && i%3!=0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}
