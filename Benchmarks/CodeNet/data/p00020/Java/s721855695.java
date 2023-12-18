import java.util.Scanner;


public class Main{

	static Scanner sc = new Scanner(System.in);
	
	static String str;
	
	public static void main(String[] args) {
		
		while(read()){
			solve();
		}

	}
	
	public static boolean read(){
		if(!sc.hasNext()) return false;
		
		str = sc.nextLine();
		
		return true;
	}
	
	public static void solve(){
		
		System.out.println(str.toUpperCase());
		
	}

}