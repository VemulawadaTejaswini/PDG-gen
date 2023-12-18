import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class Main {
	public static void main(String[] args){
		int i, max = 0, currentmin = 10^9, size, differ = 0;
		List<Integer> numbers = new ArrayList<Integer>();

		Scanner in = new Scanner(System.in);
		
		size = Integer.parseInt(in.nextLine());
		for(i = 0; i < size; i++) numbers.add(Integer.parseInt(in.nextLine()));
		
		for(i = 0; i < size; i++){
			if(numbers.get(i) < currentmin) currentmin = numbers.get(i);
			differ = numbers.get(i) - currentmin;
			if(differ > max) max = differ;
		}
		System.out.println(max);

	}
}