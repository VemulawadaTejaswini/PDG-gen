
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> monster = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			monster.add(sc.nextInt());
		}
		while(!(monster.size() == 1)) {
			Collections.sort(monster);
			int tmp = monster.get(0);
			monster = monster.stream().map(num -> num % tmp).collect(Collectors.toList());
			List<Integer> delete = new ArrayList<>();
			delete.add(0);
			monster.removeAll(delete);
			monster.add(tmp);
		}
		System.out.println(monster.get(0));
	}
}
