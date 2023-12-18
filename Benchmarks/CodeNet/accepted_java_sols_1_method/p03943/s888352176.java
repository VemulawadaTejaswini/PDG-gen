import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(scanner.nextInt());
		arr.add(scanner.nextInt());
		arr.add(scanner.nextInt());

		int sum = 0;
		for(int i = 0; i < arr.size(); i++) sum += arr.get(i);

		boolean miss = true;

		for(int i = 0; i < arr.size(); i++)for(int j = 1; j < arr.size(); j++)if(arr.get(i) + arr.get(j) == sum/2)miss = false;

		if(miss) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}

		scanner.close();
	}
}