import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String s = sc.next();
		//String t = sc.next();
		long n = sc.nextLong();
		long m = sc.nextLong();
		//long k = sc.nextLong();
		//long l = sc.nextLong();
		long count=0;

		for(int i=1;i<10000;i++) {
			if(n<500*(i+1)) {
				count=i;
				break;
			}
		}
		if(500*count+m>=n) {
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		//System.out.println((int)Math.ceil((n+m)/2.0));
		//System.out.println(n-m-k*x);
	}
}


