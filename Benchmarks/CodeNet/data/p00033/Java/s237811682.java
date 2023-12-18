import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		boolean flag = true;
		
		int nico = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < nico; i++) {
			String[] param = sc.nextLine().split(" ");
			
			int large = 0;
			int small = 0;
			for (int j = 0; j < 10; j++) {
				int tmp = Integer.parseInt(param[j]);
				
				if (large < tmp) {
					large = tmp;
				} else if (small < tmp) {
					small = tmp;
				} else {
					flag = false;
					break;
				}
			}
			if (flag) System.out.println("YES");
			else System.out.println("NO");
		}
		
	}
}