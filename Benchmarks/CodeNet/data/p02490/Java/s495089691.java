import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a, b;
		while(true){
			a = cin.nextInt();
			b = cin.nextInt();
			if(a == 0 && b == 0){
				break;
			}
			int tmp = a;
			a = b;
			b = tmp;
			System.out.printf("%d %d\n", a, b);
		}
	}
}