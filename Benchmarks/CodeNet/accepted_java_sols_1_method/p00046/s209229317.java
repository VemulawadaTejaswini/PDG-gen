import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double min = Double.MAX_VALUE;
		double max = Double.MIN_VALUE;
		while(sc.hasNext()){
			double db = sc.nextDouble();
			min = Math.min(min, db);
			max = Math.max(max, db);
		}
		System.out.println(max-min);
		sc.close();
	}
}