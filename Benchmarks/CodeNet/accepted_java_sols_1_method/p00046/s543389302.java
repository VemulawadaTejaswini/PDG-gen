import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner sc = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Double> height = new ArrayList<Double>();
		double max=0;
		double min =1000000;

		while (sc.hasNext()) {
			height.add(sc.nextDouble());
		}

		for(int i=0;i<height.size();i++){
			max=Math.max(max, height.get(i));

		}
		for(int i=0;i<height.size();i++){
			min=Math.min(min, height.get(i));
		}

		System.out.println(max-min);




	}

}