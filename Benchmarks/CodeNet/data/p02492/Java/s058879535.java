import java.util.Scanner;


public class  Main {

	static Scanner sc = new Scanner(System.in);
	
	static int a, b, ans=0;
	static String op;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		
		a = sc.nextInt();
		op = sc.next();
		b = sc.nextInt();
		
		if(op.equals("?")) return false;
		
		return true;
		
	}
	
	static void solve(){
		
		if(op.equals("+")){
			ans = a + b;
		}
		else if(op.equals("-")){
			ans = a - b;
		}
		else if(op.equals("*")){
			ans = a * b;
		}
		else if(op.equals("/")){
			ans = a / b;
		}
		
		System.out.println(ans);
	}

}