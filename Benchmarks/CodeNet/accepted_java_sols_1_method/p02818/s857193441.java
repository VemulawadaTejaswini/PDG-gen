
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		long k=sc.nextLong();
		long h=a;
		a=Math.max(a-k, 0);
		if(a<k) {
			b=Math.max(0, b-(k-h));
		}
		System.out.println(a+" "+b);

	}

}
