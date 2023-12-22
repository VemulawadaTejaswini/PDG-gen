import java.util.Scanner;
 
public class Main {
	private static Scanner sc = new Scanner(System.in);
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p(long ans) {System.out.println(ans);};
	static String eikomoji[]={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	public static void main(String[] args) {
	long N =sc.nextLong();
	long A =sc.nextLong();
	long B =sc.nextLong();
	long ans=0;
		ans+=((long)N/(A+B))*A;
		if(A-N%(A+B)>0) {
			ans+=N%(A+B);
		}else if(A-N%(A+B)<=0) {
			ans+=A;
		}
	p(ans);
	
	
	}
}