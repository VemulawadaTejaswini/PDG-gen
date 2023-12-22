import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] c = sc.next().toCharArray();
		
		int res = 0;
		
		for(int i = 1; i < c.length; i++) {
			if(c[i] == c[i-1]) {
				c[i] = c[i-1] == '0' ? '1' : '0';
				res++;
			}
		}
		System.out.println(res);
	}
}
