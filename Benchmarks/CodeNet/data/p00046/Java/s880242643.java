import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		List<Double> list = new ArrayList<Double>();
		while(sc.hasNextDouble()) {
			double d = sc.nextDouble();
			if(d == 0) break;
			list.add(d);
		}
		sc.close();
		
		Collections.sort(list, new Comparator<Double>() {
			public int compare(Double o1, Double o2){
				if(o1 < o2) return -1;
				else if(o1 == o2) return 0;
				else return 1;
			}});
		
		double result = list.get(list.size()-1) - list.get(0);
		System.out.println(result);
	}
	
}