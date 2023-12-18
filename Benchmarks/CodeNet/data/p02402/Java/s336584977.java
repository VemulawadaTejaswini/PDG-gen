import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		List<Integer> value = new ArrayList<>();
		int num = scn.nextInt();
		int min = 1000000;int max = -1000000;long sum = 0;
		for (int i = 0; i < num; i++) {
			value.add(scn.nextInt());
			if (value.get(i) > max) {
				max = value.get(i);
			}
			if (value.get(i) < min) {
				min = value.get(i);
			}
			sum += value.get(i);
		}
		System.out.println(min + " " + max + " "+sum);
	}
}

