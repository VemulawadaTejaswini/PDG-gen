import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String s = sc.next();
		long n = sc.nextLong();
		long m = sc.nextLong();
		long k = sc.nextLong();

		if(n==m) {
			System.out.println(k);
		}else if(m==k){
			System.out.println(n);
		}else {
			System.out.println(m);
		}
		//System.out.println(n*n-m);
	}
}


