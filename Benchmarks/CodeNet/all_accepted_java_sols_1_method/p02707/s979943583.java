import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i < N; i++) {
			list.add(Integer.parseInt(sc.next()));
		}
		sc.close();
		
		list.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
		
		Map<Object, Long> map = list.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));

		for(int i = 1; i < N + 1; i++) {
			if(map.get(i) == null) {
				System.out.println(0);
			}else {
				 System.out.println(map.get(i));
			}
		}
	}
}