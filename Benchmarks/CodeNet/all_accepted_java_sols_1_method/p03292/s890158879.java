import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] temp = scanner.nextLine().split(" ");
		int[] list = new int[temp.length];
		for(int i = 0; i < 3; i++) {
			list[i] = Integer.parseInt(temp[i]);
			if(list[0] > list[i]) {
				int te = list[0];
				list[0] = list[i];
				list[i] = te;
			}
		}

		int ans = 0;
		if(list[2] > list[1]) {
			ans = (list[1] - list[0]) + (list[2] - list[1]);
		}else {
			ans = (list[2] - list[0]) + (list[1] - list[2]);
		}

		System.out.println(ans);
	}
}
