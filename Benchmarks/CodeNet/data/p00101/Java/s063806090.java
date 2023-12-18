import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
			
			if (line.contains("Hoshino")) {
				Pattern p = Pattern.compile("Hoshino");
				Matcher m = p.matcher(line);
				
				System.out.println(m.replaceFirst("Hoshina"));
			}
		}
	}
}