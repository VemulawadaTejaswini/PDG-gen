import java.util.HashMap;
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
			HashMap<String, Integer> nico = new HashMap<String, Integer>();
			
			for (int i = 0; i < lines; i++) {
				String line = sc.nextLine();
				String[] data = line.split(" ");
				
				int sales = Integer.parseInt(data[1]) * Integer.parseInt(data[2]);
				if (nico.containsKey(data[0]) == true) {
					nico.put(data[0], nico.get(data[0]) + sales);
				} else {
					nico.put(data[0], sales);
				}
	
			
			boolean na = true;
			for (String key : nico.keySet()) {
				if (nico.get(key) >= 1000000) {
					System.out.println(key);
					na = false;
				}
			}
			if (na == true) System.out.println("NA");
			
			lines = Integer.parseInt(sc.nextLine());
		}
	}
}