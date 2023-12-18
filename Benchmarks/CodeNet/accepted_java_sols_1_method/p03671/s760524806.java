import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		String[] array = s.split(" ");

		int a = Integer.parseInt(array[0]);
		int b = Integer.parseInt(array[1]);
		int c = Integer.parseInt(array[2]);

		int ab = a + b;
		int bc = b + c;
		int ac = a + c;

		if (ab <= bc && ab <= ac) {
			System.out.println(ab);
		} else if (bc <= ab && bc <= ac) {
			System.out.println(bc);
		} else if (ac <= bc && ac <= ab) {
			System.out.println(ac);
		}
	}
}
