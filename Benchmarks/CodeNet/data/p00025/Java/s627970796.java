import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a1, a2, a3, a4;
		int b1, b2, b3, b4;
		int hit, blow;

		while (sc.hasNext()) {
			a1 = sc.nextInt();
			a2 = sc.nextInt();
			a3 = sc.nextInt();
			a4 = sc.nextInt();
			b1 = sc.nextInt();
			b2 = sc.nextInt();
			b3 = sc.nextInt();
			b4 = sc.nextInt();
			hit = 0;
			blow = 0;
			
			if (a1 == b1) hit++;
			if (a2 == b2) hit++;
			if (a3 == b3) hit++;
			if (a4 == b4) hit++;
			if (a1 == b2) blow++;
			if (a1 == b3) blow++;
			if (a1 == b4) blow++;
			if (a2 == b1) blow++;
			if (a2 == b3) blow++;
			if (a2 == b4) blow++;
			if (a3 == b1) blow++;
			if (a3 == b2) blow++;
			if (a3 == b4) blow++;
			if (a4 == b1) blow++;
			if (a4 == b2) blow++;
			if (a4 == b3) blow++;
			System.out.println(hit + " " + blow);
		}
	}
}