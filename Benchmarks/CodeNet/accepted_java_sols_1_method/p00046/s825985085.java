import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		double min = Double.MAX_VALUE;
		double max = Double.MIN_VALUE;
		while(sc.hasNextDouble()){
			double h = sc.nextDouble();
			if(min>h)min=h;
			if(max<h)max=h;
		}
		System.out.println(max-min);
	}
}