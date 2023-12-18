import java.util.Scanner;

public class Main {
	private Scanner sc;

	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		while (sc.hasNextLine()) {
			String nico = sc.nextLine();
			
			int state = 0;
			String tmp = "";
			
			String m = "";
			for (int i = 0; i < nico.length(); i++) {
				char c = nico.charAt(i);
				 
				if ((c != ' ') && (c != ',') && (c != '.')) {
					state++;
					tmp = tmp + nico.charAt(i);
				} else {
					if ((3 <= state) && (state <= 6)) {
						System.out.print(m + tmp);
						m = " ";
					}
					
					state = 0;
					tmp = "";
				}
			}
		}
	}
}