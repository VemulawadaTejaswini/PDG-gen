import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = Integer.parseInt(scanner.nextLine());

		List<Integer> h = new ArrayList<Integer>();

		for (int i = 0; i < num; i++) {
			h.add(Integer.parseInt(scanner.next()));
		}

		int times = 0;
		int preH = 0;
		int min = 0;

		for (int tmp : h) {
			if (tmp < preH) {
				times += preH - min;
				min = tmp;
			}
			preH = tmp;
		}
		times += preH - min;

		System.out.println(times);
	}

}
