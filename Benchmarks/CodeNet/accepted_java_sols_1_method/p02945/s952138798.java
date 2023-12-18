import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int p =a+b;
		int m =a-b;
		int k = a*b;

		if((p>=m)&&(p>=k)) {
			System.out.println(p);
		}else if((m>=p)&&(m>=k)) {
			System.out.println(m);
		}else if((k>=m)&&(k>=m)) {
			System.out.println(k);
		}

	}

}