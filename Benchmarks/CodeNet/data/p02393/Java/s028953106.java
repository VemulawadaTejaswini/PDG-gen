import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdn = new Scanner(System.in);

		int a = stdn.nextInt();
		int b = stdn.nextInt();
		int c = stdn.nextInt();

		for(int i=0; i<3; i++) { 
			if (a > b){
				int t = a;
				a = b;
				b = t;
			}else if (a > c) {
				int t = a;
				a = c; 
				c = t;
			}else if (b > c) {
				int x = b;
				b = c; 
				c = x;
			}
		}

		System.out.println(a + " " + b + " " + c);
	}
}