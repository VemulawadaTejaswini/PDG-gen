
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		ArrayList<Double> inputs = new ArrayList<Double>(6);
		ArrayList<Double> resultsX = new ArrayList<Double>(5);
		ArrayList<Double> resultsY = new ArrayList<Double>(5);
		ArrayList<Double> resultsRadius = new ArrayList<Double>(5);
		
		int numLines = sc.nextInt();
		for(int n = 0; n < numLines; n++){
			setInputs(inputs);
			resultsX.add(getPointX(inputs.get(0), inputs.get(1), inputs.get(2), inputs.get(3), inputs.get(4), inputs.get(5)));
			resultsY.add(getPointY(inputs.get(0), inputs.get(1), inputs.get(2), inputs.get(3), inputs.get(4), inputs.get(5)));
			resultsRadius.add(getDistance(inputs.get(0), inputs.get(1), resultsX.get(n), resultsY.get(n)));
			inputs.clear();
		}
		
		for(int n = 0; n < numLines; n++){
			System.out.printf("%.3f %.3f %.3f\n",resultsX.get(n), resultsY.get(n), resultsRadius.get(n));
		}
	}
	
	private static void setInputs(ArrayList<Double> list){		
		list.add(sc.nextDouble());
		list.add(sc.nextDouble());
		list.add(sc.nextDouble());
		list.add(sc.nextDouble());
		list.add(sc.nextDouble());
		list.add(sc.nextDouble());
	}
	
	private static double getPointX(double x1, double y1, double x2, double y2, double x3, double y3){
		double a1 = 2 * (x2 - x1);
		double b1 = 2 * (y2 - y1);
		double c1 = (x1 * x1) - ( x2 * x2) + (y1 * y1) - (y2 * y2);
		double a2 = 2 * (x3 - x1);
		double b2 = 2 * (y3 - y1);
		double c2 = (x1 * x1) - (x3 * x3) + (y1 * y1) - (y3 * y3);
		
		double numerator = b1 * c2 - b2 * c1;
		double denominator = a1 * b2 - a2 * b1;
		
		return numerator / denominator;
	}
	
	private static double getPointY(double x1, double y1, double x2, double y2, double x3, double y3){
		double a1 = 2 * (x2 - x1);
		double b1 = 2 * (y2 - y1);
		double c1 = (x1 * x1) - ( x2 * x2) + (y1 * y1) - (y2 * y2);
		double a2 = 2 * (x3 - x1);
		double b2 = 2 * (y3 - y1);
		double c2 = (x1 * x1) - (x3 * x3) + (y1 * y1) - (y3 * y3);
		
		double numerator = b1 * c2 - b2 * c1;
		double denominator = a1 * b2 - a2 * b1;
		
		return numerator / denominator;
	}
	
	public static double getDistance(double x1, double y1, double x2, double y2){
		double distanceX = getDistanceX(x1, x2);
		double squareX = distanceX * distanceX;
		
		double distanceY = getDistanceY(y1, y2);
		double squareY = distanceY * distanceY;
		
		return Math.sqrt(squareX + squareY);
	}

	private static double getDistanceX(double x1, double x2){
		double distanceX = x1 - x2;
		if(distanceX < 0){
			distanceX = distanceX * (-1);
		}
		return distanceX;
	}
	
	private static double getDistanceY(double y1, double y2){
		double distanceY = y1 - y2;
		if(distanceY < 0){
			distanceY = distanceY * (-1);
		}
		return distanceY;
	}
}