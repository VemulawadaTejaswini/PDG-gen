import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		int lines = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < lines; i++) {
			String line = sc.nextLine();
			String[] words = line.split(" ");
			
			for (int j = 0; j < lines; j++) {
				if (words[j].equals("Hoshino")) System.out.print("Hoshina");
				else System.out.print(words[j]);
				
				if (j != (lines - 1)) System.out.print(" ");
				else System.out.println();
			}
		}
	}
}