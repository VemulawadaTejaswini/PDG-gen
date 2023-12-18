import java.util.*;
public class Main {
	public static void main(String...args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i = 0; i < N; i++) {
			float[] x = new float[3];
			x[0] = sc.nextFloat();
			x[1] = sc.nextFloat();
			x[2] = sc.nextFloat();
			Arrays.sort(x);
			float a,b,c,d,e,f = 0;
			// 3:4:5
			a = x[0]/3.0f;
			b = x[1]/4.0f;
			c = x[2]/5.0f;
			// 5:12:13
			d = x[0]/5.0f;
			e = x[1]/12.0f;
			f = x[2]/13.0f;
			if(a == b && b == c) {
				System.out.println("YES");
			}
			else if(d == e && e == f) {
				System.out.println("YES");
			}
			// Not a right angled triangle.
			else {
				System.out.println("NO");
			}
		}
	}
}