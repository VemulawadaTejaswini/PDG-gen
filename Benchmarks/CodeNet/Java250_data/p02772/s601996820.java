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
	boolean a=true;
	for(int i=0;i<n;i++) {
		int tmp=sc.nextInt();
		if(tmp%2==0) {
			if(tmp%3==0||tmp%5==0) {
				
			}else {
				a=false;
			}
		}
	}
	if(a) {
		p("APPROVED");
	}else {
		p("DENIED");
	}
	
	
	}
}