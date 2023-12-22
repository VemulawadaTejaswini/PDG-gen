import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i = 0; i < n; i++){
			numbers.add(sc.nextInt());
		}
		Collections.sort(numbers);
		System.out.println(numbers.get(n-1) - numbers.get(0));
	}
}
