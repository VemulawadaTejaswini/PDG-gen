import java.util.*;

class Main{
	static int mod=1000000007;

	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);

		int n=s.nextInt(),m=s.nextInt()*2+1;

		System.out.println((n+m-1)/m);
	}
}
