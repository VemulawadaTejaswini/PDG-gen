import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		while (sc.hasNextLine() == true) {
			String[] acards = sc.nextLine().split(" ");
			String[] bcards = sc.nextLine().split(" ");

			int[] ac = new int[acards.length];
			int[] bc = new int[bcards.length];
			for (int i = 0; i < acards.length; i++) {
				ac[i] = Integer.parseInt(acards[i]);
				bc[i] = Integer.parseInt(bcards[i]);
			}
			
			int h = 0;
			int b = 0;
			for (int i = 0; i < ac.length; i++) {
				for (int j = 0; j < bc.length; j++) {
					if (ac[i] == bc[j]) {
						if (i == j) h++;
						else b++;
					}
				}
			}
			
			System.out.println(h + " " + b);
		}
	}
}