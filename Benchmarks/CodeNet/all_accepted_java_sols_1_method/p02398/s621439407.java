import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int div;
		int cnt = 0;

		for(div = a; div <= b; div++) {

			if(c%div == 0){

				cnt++;

			} else {}
		}
		System.out.println(cnt);
		sc.close();
	}

}