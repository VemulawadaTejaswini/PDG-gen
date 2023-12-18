import java.util.Scanner;
public class Main {
	static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		double x [] = new double [20];
		double y [] = new double [20];
		int i=0;
		while (sc.hasNextLine()){
			String[] numbers = sc.nextLine().split(",");
			double answer [] = new double [2];
			answer[0] = Double.parseDouble(numbers[0]);
			answer[1] = Double.parseDouble(numbers[1]);				
			x[i] = answer[0];
			y[i] = answer[1];
			System.out.println(i+"="+x[i]);
			System.out.println(i+"="+y[i]);
			i++;
		}
		double area =0;
		for (int k=0; k<i; k++){
			area+=x[k]*y[k+1]-x[k+1]*y[k];
		}
		System.out.println(area);
		}
	}