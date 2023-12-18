import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		
		Scanner sc = new Scanner(System.in);
		
		int number = Integer.parseInt(sc.next());
		List<Integer> x_numbers = new ArrayList<>();
		List<Integer> y_numbers = new ArrayList<>();
		
		for(int i = 0 ; i< number;i++){
			
			x_numbers.add(Integer.parseInt(sc.next()));
		}
		
		for(int i = 0 ; i< number;i++){
			
			y_numbers.add(Integer.parseInt(sc.next()));
		}
		
		int p = 1;
		double value1  =computeMinkowskiDistance(x_numbers,y_numbers,p);
		System.out.println(String.format("%.6f",value1));
		p = 2;
		double value2  =computeMinkowskiDistance(x_numbers,y_numbers,p);
		System.out.println(String.format("%.6f",value2));
		
		p = 3;
		double value3  =computeMinkowskiDistance(x_numbers,y_numbers,p);
		System.out.println(String.format("%.6f",value3));
		
		p = 10000000;
		double valueInfinite  =computeMinkowskiDistance(x_numbers,y_numbers,p);
		System.out.println(String.format("%.6f",valueInfinite));
		
		
		
		sc.close();
	}

	private static double computeMinkowskiDistance(List<Integer> x_numbers,
			List<Integer> y_numbers, double p) {
		
		if(x_numbers.size() != y_numbers.size()){
			throw new IllegalArgumentException();
		}
		
		double sum = 0.0;
		
		List<Double> x_minus_y_absList = new ArrayList<>();
		for(int i = 0;i<x_numbers.size();i++){
			
			double x_minus_y_abs = Math.abs(x_numbers.get(i) - y_numbers.get(i));
			x_minus_y_absList.add(x_minus_y_abs);
			sum += Math.pow(x_minus_y_abs,p);
		}
		
		if(Double.isInfinite(sum)){
			
			sum = max(x_minus_y_absList);
			return sum;
		}
		
		return Math.pow(sum, 1/p);
	}

	private static double max(List<Double> x_minus_y_absList) {
		
		double ans = 0.0;
		for(int i = 0; i<x_minus_y_absList.size();i++){
			
			if(ans < x_minus_y_absList.get(i)){
				
				ans = x_minus_y_absList.get(i);
				
			}
			
		}
		
		
		return ans;
	}
}

