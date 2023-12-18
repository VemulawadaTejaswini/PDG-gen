import java.util.Scanner;

public class Main {
	private Scanner sc;

	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			
			int state = 0;
			char c = ' ';
			for (int i = 0; i < line.length(); i++) {
				switch (state) {
				case 0:
					if (line.charAt(i) == '@') state++;
					else System.out.print(line.charAt(i));
					break;
					
				case 1:
					c = line.charAt(i);
					state++;
					break;
				
				case 2:
					int loops = line.charAt(i) - '0';
					for (int j = 0; j < loops; j++) {
						 System.out.print(c);
					}
					state = 0;
				}
			}
			
			System.out.println();
		}
	}
}