import java.util.Scanner;
class Main{
	static final Scanner s=new Scanner(System.in);
	public static void main(String[]$){
		int n=s.nextInt(),r=1;
		while(r*2<=n)
			r*=2;
		System.out.println(r);
	}
}
