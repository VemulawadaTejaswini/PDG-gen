import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		int max = 0;
		int num = 0;
		
		int nico = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < nico; i++) {
			String[] data = sc.nextLine().split(" ");
			
			int tmpn = Integer.parseInt(data[0]);
			int tmpm = Integer.parseInt(data[1]);
			if (max <= tmpm) {
				if (max == tmpm) {
					if (num > tmpn) num = tmpn;
				} else {
					max = tmpm;
					num = tmpn;
				}
			}
		}
		System.out.println(num + " " + max);
	}
}