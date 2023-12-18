import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<10; i++) {
			list.add(Integer.parseInt(sc.nextLine()));
		}
		Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer first, Integer second) {
				int f = first;
				int s = second;
				return s-f;
			}
		});
		for(int i=0; i<3; i++) {
			System.out.println(list.get(i));
		}
	}
}