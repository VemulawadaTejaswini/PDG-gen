import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static char[] field;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		if(!sc.hasNext()) return false;
		field = sc.next().toCharArray();
		return true;
	}
	
	static void solve(){
		System.out.println(field[0] == field[field.length-1] && field[0] == 'x' ? 'x' : 'o');
	}

}