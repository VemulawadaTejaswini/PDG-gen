import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double output = 0;
		ArrayList<Double> arr = new ArrayList<>();
		for(int i = 0;i<N;i++) {
			arr.add(sc.nextDouble());
		}
		Collections.sort(arr);
		while(arr.size()>1) {
			double temp = (arr.get(0)+arr.get(1))/2;
			//System.out.println(temp);
			output=temp;
			arr.set(0, temp);
			arr.remove(1);	
		}
		System.out.println(output);
		
		
		

	}

}
