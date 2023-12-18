import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static char line[];
	static int res;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
		System.out.println(res);
	}
	static boolean read(){
		if(!sc.hasNext())return false;
		line = sc.next().toCharArray();
		return true;
	}
	static void solve(){
		for(int i = 0; i < line.length; i++){
			if(Character.isDigit(line[i])){
				int x = 0;
				while(i < line.length && Character.isDigit(line[i])){
					x *= 10;
					x += line[i] - '0';
					i++;
				}
				res += x;
			}
		}
	}
}