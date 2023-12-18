import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long count=0;
		
		for(int i=0;i<N;i++) {
			long a=sc.nextLong();
			while(a%2==0) {
				count++;
				a/=2;
			}
		}
		System.out.println(count);		
	}
}
