import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		Arrays.sort(s);
		int num = 1;
		boolean c = true;
		for(int i = 0; i < s.length-1; i++) {
			if(s[i] == s[i+1]) {
				num++;
			}else {
				if(num % 2 != 0) {
					c = false;
					break;
				}
				num = 1;
			}
		}
		if(num % 2 != 0) c = false;
		if(c)System.out.println("Yes");
		else System.out.println("No");
	}
}
