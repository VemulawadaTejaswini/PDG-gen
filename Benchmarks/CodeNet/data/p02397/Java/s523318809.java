import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] a) throws IOException {
		print();
	}

	private static void print() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.toString();
		String[] nums = line.split(",", 0);
		int x = Integer.parseInt(nums[0]);
		int y = Integer.parseInt(nums[1]);

		while (true) {
			if(x == 0 && y == 0){
				break;
			}

			if (x > y) {
				System.out.println(y + " " + x);
			} else if (x < y) {
				System.out.println(x + " " + y);
			}else{
				System.out.println(y + " " + x);
			}
		}

	}

}