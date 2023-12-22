import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long n=sc.nextLong();
		List<Long> yakusu = new ArrayList<>();
		List<Long> kotae  = new ArrayList<>();
		int count=0;
		for(long i=1;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				yakusu.add(i);
				kotae.add(n/i);
				count++;
			}
		}
long max= Long.MAX_VALUE;
		for(int i=0;i<count;i++) {
			long keta1=Long.toString(yakusu.get(i)).length();
			long keta2=Long.toString(kotae.get(i)).length();
			if(Math.max(keta1,keta2)<max) max=Math.max(keta1, keta2);
		}

		System.out.println(max);
	}
}
