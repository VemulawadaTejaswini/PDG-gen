import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] list = scanner.nextLine().split(" ");

		int t_v = Integer.parseInt(list[0]);
		int t_a = Integer.parseInt(list[1]);
		int a_v = Integer.parseInt(list[2]);
		int a_a = Integer.parseInt(list[3]);
		int t_flag = 0;
		int a_flag = 0;


		while(t_v > 0 || a_v > 0) {
			a_v -= t_a;
			if(a_v <= 0) {
				t_flag ++;
				break;
			}
			t_v -= a_a;
			if(t_v <= 0) {
				a_flag ++;
				break;
			}
		}

		if(t_flag == 1) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
}