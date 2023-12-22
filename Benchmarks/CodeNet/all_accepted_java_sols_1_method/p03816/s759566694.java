
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		int list_size = list.size();

		Set<Integer> set = new HashSet<>(list);
		int set_size = set.size();
		
		int dist = list_size - set_size;
		if(dist % 2 == 0) {
			System.out.println(set_size);
		} else {
			System.out.println(set_size - 1);
		}
	}
}

