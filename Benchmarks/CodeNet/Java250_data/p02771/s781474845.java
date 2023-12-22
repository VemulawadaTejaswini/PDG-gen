import java.util.Scanner;
 

//result = Math.pow(num1, num3)
//StringBuffer str = new StringBuffer(hoge1);
//String hoge2 = str.reverse().toString();
public class Main {
	private static Scanner sc = new Scanner(System.in);
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p(long ans) {System.out.println(ans);};
	//static String eikomoji[]={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	
	
	public static void main(String[] args) {
	int n =sc.nextInt();
	int a =sc.nextInt();
	int b =sc.nextInt();
	if(n==a&&n!=b) {
		p("Yes");
	}else if(n==b&&n!=a) {
		p("Yes");
	}else if(a==b&&a!=n) {
		p("Yes");
	}else {
		p("No");
	}
	
	
	
	}
}