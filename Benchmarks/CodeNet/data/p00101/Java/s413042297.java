import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n;
	static String[] in;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		
		if(!sc.hasNext())return false;
		n = sc.nextInt();sc.nextLine();
		for(int i = 0; i < n; i++){
			solve();
		}
		return true;
	}
	
	static void solve(){
		System.out.println(sc.nextLine().replace("Hoshino", "Hoshina"));
	}

}