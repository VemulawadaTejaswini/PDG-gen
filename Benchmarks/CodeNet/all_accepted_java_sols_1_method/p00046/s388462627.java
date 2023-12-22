import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<Double>();
		
		while(sc.hasNext()){
			list.add(sc.nextDouble());
		}
		Collections.sort(list);
		double sub = list.get(list.size()-1) - list.get(0);
		System.out.println(sub);
	}
}