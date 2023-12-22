import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int a = 0;
		for(int i=X; i<1000000; i++) {
			int b = 0;
			for(int j=1; j<i; j++) {
				if(i%j==0) b++;
			}
			if(b<=2) {
				a = i;
				break;
			}
		}
		sc.close();
		System.out.println(a);
	}

}