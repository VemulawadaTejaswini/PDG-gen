import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int kakera = 0;
		int pie = 0;

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int p = sc.nextInt();

		kakera = a*3 + p;

		if(kakera > 0 && kakera % 2 == 0) {
			pie = kakera / 2;
		}else {
			kakera --;
			pie = kakera / 2;
		}

		System.out.println(pie);
	}
}
