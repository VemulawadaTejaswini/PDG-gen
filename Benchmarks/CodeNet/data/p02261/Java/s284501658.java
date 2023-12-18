import java.util.Scanner;

public class Main {
	public static void main(String[] arges) {

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int v = Integer.parseInt(line);

		String line2 = sc.nextLine();
		String[] k = line2.split(" ");

		String[] k2 = new String[v];
		for (int i = 0; i < v; i++) {
			k2[i]=k[i];
		}

		for (int i = 0; i < v; i++) {
			for (int j = v - 1; j > 0; j--) {
				int key = j - 1;
				if (Card.sub(k[key]) > Card.sub(k[j])) {
					String a = k[key];
					String b = k[j];

					k[key] = b;
					k[j] = a;

				}
			}

		}

		for (int i = 0; i < v; i++) {
			int min = i;
			for (int j = i; j < v; j++) {
				if (Card.sub(k2[min]) > Card.sub(k2[j])) {
					min = j;
				}
				
			}if (min != i) {
					String c = k2[min];
					String d = k2[i];
					k2[min] = d;
					k2[i] = c;
				}
		}
		for (int i = 0; i < v; i++) {
			System.out.print(k[i]);
			if (i != v - 1) {
				System.out.print(" ");
			}
		}System.out.println("");
		System.out.println("Stable");
		
		for (int i = 0; i < v; i++) {
			System.out.print(k2[i]);
			if (i != v - 1) {
				System.out.print(" ");
			}
		}System.out.println("");
		int count=0;
		for (int i = 0; i < v; i++) {
			if(!(k[i].equals(k2[i]))){
				count++;
			}
		}if (count==0) {
			System.out.println("Stable");
		}else{
			System.out.println("Not stable");
		}
		}

	public static class Card {
		public static int sub(String k) {
			return Integer.parseInt(k.substring(1));
		}
	}

}