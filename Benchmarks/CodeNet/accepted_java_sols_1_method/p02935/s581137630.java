import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		Double[] v = new Double[n];
		Arrays.setAll(v, i -> Double.parseDouble(sc.next()));
		List<Double> list = new ArrayList<>(Arrays.asList(v));
		while(list.size() > 1){
			list.sort(Comparator.naturalOrder());
			double x = list.get(0), y = list.get(1);
			list.remove(x);
			list.remove(y);
			list.add((x + y) / 2);
		}
		System.out.println(list.get(0));
	}
}
