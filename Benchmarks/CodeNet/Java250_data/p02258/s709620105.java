import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class Main {
	public static void main(String[] args){
		int i, max = -2147483646, currentmin, size, differ;
		List<Integer> numbers = new ArrayList<Integer>();

		Scanner in = new Scanner(System.in);
		
		size = Integer.parseInt(in.nextLine());
		for(i = 0; i < size; i++) numbers.add(Integer.parseInt(in.nextLine()));
		
		currentmin = numbers.get(0);
		for(i = 1; i < size; i++){
			differ = numbers.get(i) - currentmin;
			if(numbers.get(i) < currentmin) currentmin = numbers.get(i);
			if(differ > max) max = differ;
		}
		System.out.println(max);

	}
}