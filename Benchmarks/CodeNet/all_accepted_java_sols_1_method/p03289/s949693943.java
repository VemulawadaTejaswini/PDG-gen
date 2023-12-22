import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		String ans="AC";
		if(s[0]!='A') ans="WA";
		int count = 0;
		for(int i=1; i<s.length;i++) {
			char c = s[i];
			if(i>1 && i<s.length-1 && c=='C') {
				count++;
				continue;
			}
			if(!Character.isLowerCase(c)) ans="WA";
		}
		if(count!=1)ans="WA";
		System.out.println(ans);
	}
}
