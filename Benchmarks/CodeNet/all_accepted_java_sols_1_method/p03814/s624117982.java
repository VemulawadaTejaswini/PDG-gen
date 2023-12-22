import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0, z = 0;
		char[] s = sc.next().toCharArray();
		for(int i = 0; i < s.length; i++) {
			if(s[i] == 'A') {
				a = i;
				break;
			}
		}
		for(int i = s.length - 1; i >= 0; i--) {
			if(s[i] == 'Z') {
				z = i;
				break;
			}
		}
		System.out.println(z - a + 1);
	}
}