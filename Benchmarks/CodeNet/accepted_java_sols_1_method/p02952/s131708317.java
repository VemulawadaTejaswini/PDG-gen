import java.util.*;

class Main{
	static int mod=1000000007;

	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n<=99) {
			System.out.println(Math.min(9,n));
		}else if(n<=9999) {
			System.out.println(Math.min(909,n-99+9));
		}else{
			System.out.println(Math.min(90909,n-9999+909));
		}
	}
}
