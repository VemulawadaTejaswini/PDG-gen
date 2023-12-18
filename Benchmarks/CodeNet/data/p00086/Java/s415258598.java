import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			boolean f[] = new boolean[105];
			int c = 0;
			for(;;) {
				int a = sc.nextInt(), b = sc.nextInt();
				if( (a|b) == 0 ) break;
				f[a] = !f[a]; f[b] = !f[b]; c += f[a]? 1: -1; c += f[b]? 1: -1;
			}
			if( c == 2 && (f[1]&f[2]) ) System.out.println("OK");
			else if( c == 1 && f[1] ) System.out.println("OK");
			else if( c == 0 ) System.out.println("OK");
			else System.out.println("NG");
		}
	}
}