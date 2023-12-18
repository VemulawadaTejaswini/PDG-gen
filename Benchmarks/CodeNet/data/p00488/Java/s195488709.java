import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int[] menus = new int[5];
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		if( !sc.hasNext() )return false;
		for(int i = 0; i < menus.length; i++){
			menus[i] = sc.nextInt();
		}
		return true;
	}
	
	static void solve(){
		int pasta = Math.min(menus[0], Math.min(menus[1], menus[2]));
		int juice = Math.min(menus[3], menus[4]);
		System.out.println(pasta + juice -50);
	}

}