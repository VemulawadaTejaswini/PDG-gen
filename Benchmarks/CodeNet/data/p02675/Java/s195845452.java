import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] in = sc.next().split("");
		String last = in[in.length - 1];
		List<String> hons = Arrays.asList("2", "4", "5", "7", "9");
		List<String> pons = Arrays.asList("0", "1", "6", "8");
		if (hons.contains(last)) {
			System.out.println("hon");
		} else if (pons.contains(last)) {
			System.out.println("pon");
		} else {
			System.out.println("bon");
		}
	}
}
