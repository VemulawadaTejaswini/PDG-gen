import java.util.Scanner;

public class Main{
	
	static final Scanner s=new Scanner(System.in);
	
	public static void main(String[] __){
		long res=1;
		for(int n=s.nextInt();n>1;n--) {
			res*=n;
			res%=1000000007;
		}
		System.out.println(res);
	}
}