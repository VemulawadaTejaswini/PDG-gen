import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		List<Integer> in = new ArrayList<>();
		for(int i = 0; i < 10; i++) in.add(sc.nextInt());
		sc.close();
		
		List<Integer> result = top3(in);
		result.forEach(System.out::println);
	}
	
	static List<Integer> top3(List<Integer> l) {
		List<Integer> copy = new ArrayList<>(l);
		copy.sort((A, B) -> ( A > B ? -1: 1));
	
		return copy.subList(0, 3);
	}
}