import java.util.Scanner;
public class Main {
	static String tar;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		tar = stdIn.next();
		int ans = 0;
		for(int i = 0; i < n; i++) {
			String tmp = stdIn.next();
			if(sorv(tmp)) {
				ans++;
			}
			
		}
		System.out.println(ans);
	}
	
	static boolean sorv(String a) {
		int pp = 0;
		int cp = 0;
		if(a.length() < 3) {
			return false;
			
		}
		
		while(true) { //1文字目
			if(pp == a.length()) {
				break;
				
			}
			if(a.charAt(pp) == tar.charAt(0)) {
				//2文字目の検索 文字間隔決定
				cp = 1;
				while(true) {
					if(pp+cp >= a.length()) {
						break;
					}
					if(a.charAt(pp+cp) == tar.charAt(1)) {
						//文字間隔cpで照合
						int np = 2;
						for(int i = pp+cp+cp; i < a.length(); i+= cp) {
							
							if(a.charAt(i) == tar.charAt(np)) {
								np++;
							}
							else {
								break;
							}
							if(np == tar.length()) {
								return true;
							}
						}
					}
					cp++;
				}
			}
			pp++;
			
		}
		return false;

	}
}