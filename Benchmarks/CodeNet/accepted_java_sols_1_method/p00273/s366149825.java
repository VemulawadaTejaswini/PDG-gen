import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			int b = sc.nextInt();
			int p = sc.nextInt();
			int s = x*b + y*p;
			b = Math.max(b, 5);
			p = Math.max(p, 2);
			int t = x*b + y*p;
			System.out.println((int)Math.min(s, t*0.8));
		}
	}
}