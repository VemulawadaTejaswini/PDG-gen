import java.util.Scanner;


public class Main {
	
	static Scanner sc = new Scanner(System.in);
	static int a, b;
	
	public static void main(String[] args) {
		
		while(read())
		{	
			solve();
		}
	}
	
	static boolean read(){
		if(!sc.hasNext()) return false;
		
		a = sc.nextInt();
		b = sc.nextInt();
		return true;
	}
	
	static void solve(){
		System.out.println(Integer.toString(a+b).length());
	}
}