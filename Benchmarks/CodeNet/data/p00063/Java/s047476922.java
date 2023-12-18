import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		int index = 0;
		while (sc.hasNextLine() == true) {
			String line = sc.nextLine();

			boolean flag = true;
			for (int i = 0; i < (line.length() / 2); i++) {
				if (line.charAt(i) != line.charAt(line.length() - i - 1)) {
					flag = false;
					break;
				}
			}
			
			if (flag == true) System.out.println(index);
			index++;
		}
	}
}