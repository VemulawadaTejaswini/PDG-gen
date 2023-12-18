import java.util.*;

class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a<b) {
			int temp = a;
			a = b;
			b = temp;
		}
		
		int c = gcd(a,b);
		System.out.println(c);
		
		
	}
	
	public static int gcd(int n1, int n2){
		if (n1 == 0) {
			return n2;
		}
		if (n1 == n2) {
			return n1;
		}
		return gcd(n2%n1, n1);
	}
}


