import java.util.*;	
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		String[] c = new String[n];
		for(int i = 0;i < n;i++) {
			c[i] = sc.next();
		}
		for(int i = 0;i < m+2;i++)System.out.print("#");
		System.out.println();
		for(int i = 0;i < n;i++) {
			System.out.println("#"+c[i]+"#");
		}
		for(int i = 0;i < m+2;i++)System.out.print("#");
		System.out.println();
	}

}

