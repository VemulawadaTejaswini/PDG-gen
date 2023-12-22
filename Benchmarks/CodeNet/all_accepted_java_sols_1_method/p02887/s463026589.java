import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		sc.close();
		int r = 1;
		char c = s.charAt(0);
		for(int i=1;i<n;i++){
			char t = s.charAt(i);
			if(c == t) continue;
			c = t;
			r++;
		}
		System.out.println(r);
	}
}