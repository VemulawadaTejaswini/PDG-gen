import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> num_list = new ArrayList<Integer>();
		for(int i = 0; i < 3; i++) {
			num_list.add(sc.nextInt());
		}
		Collections.sort(num_list);
		System.out.println(num_list.get(0) + " " +num_list.get(1) + " " + num_list.get(2));
		sc.close();
	}
}
