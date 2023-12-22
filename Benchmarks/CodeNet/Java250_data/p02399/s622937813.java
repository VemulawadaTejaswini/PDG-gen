import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		boolean bl = true;
		int a=0,b=0;

		while(bl){
			a = stdIn.nextInt();
			b = stdIn.nextInt();

			if((1 <= a) && (a <= Math.pow(10, 9)) && (1 <= b) && (b <= Math.pow(10, 9)) ){
				break;
			}
		}

		int d = a / b;
		int r = a % b;
		double f = (double)a / (double)b;

		System.out.printf("%d %d %.6f", d,r,f);
	}
}