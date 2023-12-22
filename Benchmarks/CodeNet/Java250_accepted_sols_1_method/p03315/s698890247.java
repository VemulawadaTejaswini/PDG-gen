import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char s[] = sc.next().toCharArray();
		int c = 0;
		for(int i = 0;i<s.length;i++) {
			if(s[i]=='+'){
				c+=2;
			}
			c--;
		}
		System.out.println(c);
		sc.close();
	}
}