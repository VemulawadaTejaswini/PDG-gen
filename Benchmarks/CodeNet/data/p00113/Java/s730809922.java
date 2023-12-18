import java.util.HashMap;
import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		while (sc.hasNextLine() == true) {
			String line = sc.nextLine();
			String[] nico = line.split(" ");

			int p = Integer.parseInt(nico[0]);
			int q = Integer.parseInt(nico[1]);
			p = p % q;
			
			HashMap<Integer, Integer> pmap = new HashMap<Integer, Integer>();
			
			int index = 0;
			String ans = "";
			while ((p % q) != 0) {
				int div = p / q;
				
				if (pmap.containsKey(p) == true) {
					int lim = ans.length();
					ans = ans + "\n";
					
					for (int i = 0; i < pmap.get(p); i++) {
						ans = ans + " ";
					}
					for (int i = 0; i < (lim - pmap.get(p)); i++) {
						ans = ans + "^";
					}
					break;
				}
				
				pmap.put(p, index);
				ans = ans + div;
				index++;

				p = (p - div * q) * 10;
			}

			System.out.println(ans);
		}
	}
}