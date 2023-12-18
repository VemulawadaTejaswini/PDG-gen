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
			int score = 0;
			int base = 0;
			int out = 0;
		
			while (out != 3) {
				String line = sc.nextLine();
				
				switch (line) {
				case "HIT":
					if (base != 3) base++;
					else score++;
					break;
				case "HOMERUN":
					score = score + base + 1;
					base = 0;
					break;
				case "OUT":
					out++;
					break;
				}
			}
			
			System.out.println(score);
			lines--;
		}
	}
}