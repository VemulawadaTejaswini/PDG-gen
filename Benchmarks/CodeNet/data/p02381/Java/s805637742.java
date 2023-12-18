import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		StringBuilder results = new StringBuilder();
		while(sc.hasNext()){
			
			int number = Integer.parseInt(sc.next());
			if(number == 0){
				
				break;
			}
			
			List<Integer> input = new ArrayList<>(100);
			for(int i = 0;i<number;i++){
				
				int score = Integer.parseInt(sc.next());
				input.add(score);
				
			}
			
			double sd = computeStandardDeviation(input);
			
			results.append(String.format("%.8f\n", sd));
		}
		System.out.println(results);
		sc.close();
		
		
	}

	private static double computeStandardDeviation(List<Integer> input) {
		
		
		double variance = calculateVariance(input);
		return Math.sqrt(variance);
	}

	private static double calculateVariance(List<Integer> input) {
		
		int sum = calculateSum(input);
		
		double average = (double)sum / input.size();
		
		double square = 0;
		
		for(Integer number : input){
			
			square += Math.pow(number, 2);
		}
		return square / input.size() - Math.pow(average,2);
	}

	private static int calculateSum(List<Integer> input) {
		
		Integer sum = 0;
		
		for(Integer number : input){
			
			sum += number;
		}
		return sum;
	}

}

