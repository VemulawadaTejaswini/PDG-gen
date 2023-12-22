import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		int num = Integer.parseInt(sc.nextLine());
		int[] e = new int[num];
		for (int i = 0; i < num; i++) {
			e[i] = i + 1;
		}
		
		int lim = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < lim; i++) {
			String[] params = sc.nextLine().split(",");
			int l = Integer.parseInt(params[0]) - 1;
			int r = Integer.parseInt(params[1]) - 1;
			
			int tmp = e[l];
			e[l] = e[r];
			e[r] = tmp;
		}
		
		for (int i = 0; i < num; i++) {
			System.out.println(e[i]);
		}
	}
}