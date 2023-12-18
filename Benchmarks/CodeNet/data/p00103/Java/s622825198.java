import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int inning = 0;
		int attack = 0; 
		int out = 0;
		int counter = 0; // カウンタ
		String data;
		int[] point = { 0, 0 };
		int[] base = { 0, 0, 0 };

		inning = scan.nextInt();
		while (inning > 0) {
			data = scan.next();
			switch (data) {
			case "HIT":
				if (base[2] == 1) {
					base[2] = 0;
					point[attack]++;
					//System.out.println("HIT" + point[attack] + out);
				}
				for (int i = 1; i >= 0; i--) {
					if (base[i] == 1) {
						base[i] = 0;
						base[i + 1] = 1;
					}
				}

				base[0] = 1;
				break;
			case "HOMERUN":
				for (int i = 0; i < 3; i++) {
					if (base[i] == 1) {
						base[i] = 0;
						counter++;
					}
				}
				counter++;
				point[attack] += counter;
				//System.out.println("HOMERUN" + point[attack] + out);
				counter = 0;
				break;
			case "OUT":
				out++;
				//System.out.println("OUT" + point[attack] + out);

				if (out > 2) {
					out = 0;
					inning--;
					for (int i = 0; i < 3; i++) {
						base[i] = 0;
					}
					if (attack == 0)
						attack = 1;
					else
						attack = 0;
				}
				break;
			}

		}
		for (int i = 0; i < 2; i++)
			System.out.println(point[i]);
	}
}