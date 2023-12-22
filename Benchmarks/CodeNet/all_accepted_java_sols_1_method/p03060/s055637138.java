import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		String inputN = scanner.nextLine();
		String inputV = scanner.nextLine();
		String inputC = scanner.nextLine();

		scanner.close();
		
		Integer inN = Integer.parseInt(inputN);
		List<Integer> inV = Arrays.asList( inputV.split(" ") ).stream().map(x -> Integer.parseInt(x) ).collect(Collectors.toList());
		List<Integer> inC = Arrays.asList( inputC.split(" ") ).stream().map(x -> Integer.parseInt(x) ).collect(Collectors.toList());

		
		int max = 0;
		for(int i = 0; i < inN; i++) {
			int v = inV.get(i);
			int c = inC.get(i);
			
			if(v - c > 0) {
				max += v - c;
			}
		}
		
		System.out.println(max);
	}
}