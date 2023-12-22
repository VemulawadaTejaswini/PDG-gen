import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		Integer[] a = new Integer[n];
		Arrays.setAll(a, i -> Integer.parseInt(sc.next()));
		List<Integer> list = new ArrayList<>(Arrays.asList(a));
		list.sort(Comparator.reverseOrder());
		double limit = list.stream().mapToInt(Integer::intValue).sum() / (4.0 * m);
		System.out.println(list.get(m-1) >= limit ? "Yes" : "No");
	}
}
