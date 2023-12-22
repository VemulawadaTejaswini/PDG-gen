import java.util.ArrayList;
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		double ans = 0;
		ArrayList<Double> numList = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			numList.add(sc.nextDouble());
		}
		ArrayList<Double> expectList = new ArrayList<>();
		expectList.add((1 + numList.get(0)) / 2);
		for(int i = 1; i < n; i++) {
			expectList.add(((1 + numList.get(i)) / 2) + expectList.get(i - 1));
		}

		ans = expectList.get(k - 1);
		for(int i = 0; i < n - k; i++) {
			double temp = expectList.get(i + k) - expectList.get(i);
			if(ans < temp) {
				ans = temp;
			}
		}

		System.out.println(ans);
		sc.close();
	}

}