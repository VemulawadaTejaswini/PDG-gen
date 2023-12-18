import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int a, b, c, d, e;
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			d = sc.nextInt();
			e = sc.nextInt();
			if(a+b+c+d+e==0)
				break;
			int na, nb, nc;
			na = sc.nextInt();
			nb = sc.nextInt();
			nc = sc.nextInt();

			int res;
			res = e * d * (nc / d) + Math.min(c * (nc % d), e * d) + nb * b + na * a;
			if(nc % d != 0) {
				int tmp = 0;
				if(d - nc % d <= nb) {
					res = Math.min(res, e * d * (nc / d + 1) + (nb - (d - nc % d)) * b + na * a);
				}
				else if(d - nc % d <= nb + na) {
					res = Math.min(res, e * d * (nc / d + 1) + (na - (d - nc % d - nb)) * a);
				}

			}
			System.out.println(res);
		}
	}
}