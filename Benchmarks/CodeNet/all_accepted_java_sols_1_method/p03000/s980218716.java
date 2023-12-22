import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next());
		List<Integer> l = new ArrayList<>();
		for(int i = 0; i < n; i++)
			l.add(Integer.parseInt(sc.next()));
		List<Integer> res = new ArrayList<>();
		for(int i = 0; i < n + 1; i++){
			if(i == 0){
				res.add(0);
				continue;
			}
			int tmp = res.get(res.size() - 1) + l.get(i - 1);
			if(tmp > x)
				break;
			res.add(tmp);
		}
		System.out.println(res.size());
		// System.out.println("====");
		// res.forEach(System.out::println);
	}
}
