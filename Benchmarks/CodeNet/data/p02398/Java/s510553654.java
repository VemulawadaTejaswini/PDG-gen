import java.util.Scanner;

class Main {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int a;
		int b;
		int c;
		int count=0;
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		for (int i = a; i <= b; i++) {
			if(c%i==0) {
				count+=1;
			}
		}

		System.out.println(count);

		scan.close();

	}

}
