import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static String line;

	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	static boolean read(){
		if(!sc.hasNext())return false;
		line = sc.next();
		return true;
	}
	static void solve(){
		int countK = 0,
			 countU = 0,
			 countP = 0,
			 countC = 0;
		for(int i = 0; i < line.length(); i++){
			char word = line.charAt(i);
			if(word == 'K'){
				countK++;
			}else if(word == 'U'){
				countU++;
			}else if(word == 'P'){
				countP++;
			}else if(word == 'C'){
				countC++;
			}
		}
		int res = Math.min(Math.min(countK, countU),Math.min(countP, countC) );
		System.out.println(res);
	}
}