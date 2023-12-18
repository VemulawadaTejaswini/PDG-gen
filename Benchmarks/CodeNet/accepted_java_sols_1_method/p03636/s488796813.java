import java.util.Scanner;
class Main{
	static Scanner s=new Scanner(System.in);
	public static void main(String[]$){
		String in=s.next();
		int n=in.length();
		System.out.println(""+in.charAt(0)+(n-2)+in.charAt(n-1));
	}
}