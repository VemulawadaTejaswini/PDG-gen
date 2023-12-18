import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String... args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	List<Integer> nums = new ArrayList<>();
	int b = (int) (Math.pow(10, 9) / 2);
	while (sc.hasNext()) {
		nums.add(sc.nextInt());
	}

	for (int index = 0 ; index < nums.size() ; index++) {
		int num = nums.get(index);
		int c = 0;
		while (num % 2 == 0) {
			num = num / 2;
			c = c + 1;
		}
		if (c < b) {
			b = c;
		}
	}
	System.out.println(b);

  }
}
