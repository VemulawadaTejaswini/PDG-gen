import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int N = 0;
		int Cost1 = 0;
		int Cost2 = 0;
		int mid = 0;
		int mid2 = 0;
		int sum = 0;
		ArrayList <Integer> Array = new ArrayList<>();
		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		for(int i = 0;i < N; i++) {
			Array.add(scan.nextInt());
			sum += Array.get(i);
		}

		mid = sum / N;

		mid2 = mid + 1;
		
		for(int j = 0; j < Array.size(); j++){
			Cost1 += (Array.get(j) -mid) * (Array.get(j) - mid);
			Cost2 += (Array.get(j) -mid2) * (Array.get(j) - mid2);
		}
		System.out.println(Math.min(Cost1, Cost2));

	}
}