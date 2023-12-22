import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int d, r, x2000;
		r = teclado.nextInt();
		d = teclado.nextInt();
		x2000 = teclado.nextInt();
		
		if (r >= 2 && r <= 5 && d >= 1 && d <= 100 && x2000 > d && x2000 <= 200) {
			
				 int a = ((r*x2000)-d);
				System.out.println(a);
				int b = ((r*a)-d);
				System.out.println(b);
				int c = ((r*b)-d);
				System.out.println(c);
				int e = ((r*c)-d);
				System.out.println(e);
				int f = ((r*e)-d);
				System.out.println(f);
				int g = ((r*f)-d);
				System.out.println(g);
				int h = ((r*g)-d);
				System.out.println(h);
				int i = ((r*h)-d);
				System.out.println(i);
				int j = ((r*i)-d);
				System.out.println(j);
				int k = ((r*j)-d);
				System.out.println(k);
			}

		}
	}


