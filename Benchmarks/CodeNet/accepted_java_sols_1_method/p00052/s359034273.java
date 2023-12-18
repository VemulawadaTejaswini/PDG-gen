import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		int lines = Integer.parseInt(sc.nextLine());
		while (lines != 0) {
			int two = 0;
			int five = 0;
			
			for (int i = 0; i < lines; i++) {
				int tmp = i + 1;
				while ((tmp % 2) == 0) {
					tmp = tmp / 2;
					two++;
				}
				
				tmp = i + 1;
				while ((tmp % 5) == 0) {
					tmp = tmp / 5;
					five++;
				}
			}
			System.out.println(Math.min(two, five));
			
			lines = Integer.parseInt(sc.nextLine());
		}
	}
}