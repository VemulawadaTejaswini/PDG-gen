
import java.lang.reflect.GenericDeclaration;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int m=scanner.nextInt();
		if(n<m){
			int tmp=n;
			n=m;
			m=tmp;
		}
		
		System.out.println(gcd(n,m));
	}

	private static int gcd(int n, int m) {
		// TODO Auto-generated method stub
		
		if(m==0) return n;
		else return gcd(m, n%m);
	}

}

