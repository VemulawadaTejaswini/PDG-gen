import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next());

		int cost_0 = 0;
		for(int i = 0; i < m; i--) {
			if(Integer.parseInt(sc.next()) < x) {
				cost_0++;
			}else {
				break;
			}
		}
		
		int cost_x = m - cost_0;
		if(cost_0 <= cost_x) {
			System.out.println(cost_0);
		}else {
			System.out.println(cost_x);
		}

	}

}
