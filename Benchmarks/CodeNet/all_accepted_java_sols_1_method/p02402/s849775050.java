import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Long> num = new ArrayList<>();
		long count = sc.nextLong();

		for(int i = 0; i < count; i++){
			num.add(sc.nextLong());
		}

		long sum = 0;
		long max = num.get(0);
		long min = num.get(0);
		for(int i = 0; i < num.size(); i++){
			max = Math.max(max, num.get(i));
			min = Math.min(min, num.get(i));
			sum += num.get(i);
		}

		System.out.println(min + " " + max + " " + sum);
	}

}
