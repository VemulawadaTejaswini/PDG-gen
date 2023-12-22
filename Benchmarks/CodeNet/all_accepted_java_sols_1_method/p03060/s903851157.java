import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> valueList = new ArrayList(); 
		List<Integer> costList = new ArrayList(); 
		
		for(int i = 0; i < n; i++) {
			int value = sc.nextInt();
			valueList.add(value);
		}
		for(int i = 0; i < n; i++) {
			int cost = sc.nextInt();
			costList.add(cost);
		}
		
		int sum = 0;
		for(int i = 0; i < n; i++) {
			int value = valueList.get(i);
			int cost = costList.get(i);
			if(value > cost) {
				sum+= value - cost;
			}
		}
		
		
		System.out.println(sum);

		
		
	}	

}

