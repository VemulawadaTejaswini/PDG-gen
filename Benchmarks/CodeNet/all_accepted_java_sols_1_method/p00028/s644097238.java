import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		int[] hist = new int[100];
		while (sc.hasNextLine() == true) {
			int tmp = Integer.parseInt(sc.nextLine());
			hist[tmp - 1]++;
		}
		
		int max = 0;
		for (int i = 0; i < hist.length; i++) {
			if (max < hist[i]) max = hist[i];
		}
		
		for (int i = 0; i < hist.length; i++) {
			if (hist[i] == max) System.out.println(i + 1);
		}
	}
}