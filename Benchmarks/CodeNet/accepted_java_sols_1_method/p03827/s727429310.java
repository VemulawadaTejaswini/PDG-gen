import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int max = x;
		int n = sc.nextInt();
		char[] s = sc.next().toCharArray();
		for(char c : s) {
			if(c == 'I') x++;
			else x--;
			if(x > max) max = x;
		}
		System.out.println(max);
	}
}
