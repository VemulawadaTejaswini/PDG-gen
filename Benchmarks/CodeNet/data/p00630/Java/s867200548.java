
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(101);
		while(sc.hasNext()){
			char[] s = sc.next().toCharArray();
			sb.setLength(0);						//1文字ずつ
			char a = sc.next().charAt(0);
			if(a == 'X')break;
			if(a == 'U') {
				if(!(s[0] <= 'Z')) {
					s[0] = Character.toUpperCase(s[0]);
				}
			}
			else {
				if(s[0] <= 'Z') {
					s[0] = Character.toLowerCase(s[0]);
				}
			}
			sb.append(s[0]);
			for(int i=1;i<s.length;i++) {
				if(s[i]=='_') {
					s[i+1] = Character.toUpperCase(s[i+1]);
				}
				else if(s[i]<='Z' && a =='D') {
					s[i] = Character.toLowerCase(s[i]);
					sb.append('_').append(s[i]);
				}
				else sb.append(s[i]);
			}
			System.out.println(sb.toString());
		}
	}
}
