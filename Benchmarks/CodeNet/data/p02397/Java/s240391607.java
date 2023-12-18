import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

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
	@SuppressWarnings("static-access")
	private boolean read() {
		while (true) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				Integer data[] = new Integer[]{0, 0};
				String s = br.readLine();
				StringTokenizer st = new StringTokenizer(s, " ");
				data[0] = Integer.parseInt(st.nextToken());
				data[1] = Integer.parseInt(st.nextToken());
				if (0 == data[0] && 0 == data[1]) {
					break;
				}
				if (!check(data[0], data[1])) {
					return false;
				}
				add(data);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
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

