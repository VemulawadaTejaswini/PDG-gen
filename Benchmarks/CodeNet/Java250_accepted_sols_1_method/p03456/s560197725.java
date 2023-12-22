import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int c = 1;
		if(b < 10) {
			c = 10*a +b;
		}else if(b < 100) {
			c = 100*a +b;
		}else {
			c = 1000*a +b;
		}
		int hantei = 0;
		for(int i=1; i<317; i++) {
			if(i*i == c) {
				hantei += 1;
			}
		}
		if(hantei > 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
