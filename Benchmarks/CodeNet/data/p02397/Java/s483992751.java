import java.util.ArrayList;
import java.util.Scanner;

class SwappingTwoNumbers extends ArrayList<Integer[]> {

	private static final int DATA_MAX = 10000;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public SwappingTwoNumbers() {
		
	}
	
	private boolean check(int x, int y) {
		if (DATA_MAX < x || DATA_MAX < y) {
			return false;
		}
		return true;
	}
	private boolean read() {
		while (true) {
			Scanner scan = new Scanner(System.in);
			Integer data[] = new Integer[2];
			data[0] = scan.nextInt();
			data[1] = scan.nextInt();
			if (0 == data[0] && 0 == data[1]) {
				break;
			}
			if (!check(data[0], data[1])) {
				return false;
			}
			add(data);
		}
			
		return true;
	}
	
	private void swap() {
		for (int i = 0; i < size(); i++) {
			int tmp = get(i)[0];
			get(i)[0] = get(i)[1];
			get(i)[1] = tmp;
			
		}
	}
	
	public void run() {
		if (!read()) {
			System.out.println("入力エラー");
		}
		swap();
		
		for (int i = 0; i < size(); i++) {
			System.out.println(get(i)[0] + " " + get(i)[1]);
		}
	}
}
public class Main {

	public static void main(String[] args) {

		new SwappingTwoNumbers().run();
	}

}

