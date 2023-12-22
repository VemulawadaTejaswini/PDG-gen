
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char []s = sc.next().toCharArray();
		String t = sc.next();
		
		int n = s.length;
		int m = t.length();
		boolean jdg = false;
		
		if(n < m) {
			System.out.println("UNRESTORABLE");
			return;
		}
		
		int num = -1;
		
		for(int i = n-1 ;i >= m-1 ;i--) {
			if(t.charAt(m-1) == s[i] || s[i] == '?') {
				int j = 0;
				while(j <= m-1) {
					if(s[i-j] != t.charAt(m-j-1) && s[i-j] != '?') {
						break;
					}
					j++;
				}
				if(j == m) {
					num = i - j + 1;
					jdg = true;
					break;
				}
				num = -1;
			}
	}
		int cnt = 0;
		
		for(int i = 0 ;i < n ;i++) {
			if(num > i || cnt == m) {
				if(s[i] == '?') {
					s[i] = 'a';
				}
			}
			else {
				s[i] = t.charAt(cnt);
				cnt++;
			}
		}
		
		String ans = String.valueOf(s);
		
		if(!jdg) {
			System.out.println("UNRESTORABLE");
			return;
		}
			System.out.println(ans);
		}
	}

