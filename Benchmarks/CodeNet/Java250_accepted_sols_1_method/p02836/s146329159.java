import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		char[] s = str.toCharArray(); 
		int cnt = 0;

		for(int i=0;i<str.length() / 2;i++){
			if(s[i] != s[str.length() - 1 - i] ){
				cnt++;
			}	
		}
		System.out.println(cnt);
		}
	}