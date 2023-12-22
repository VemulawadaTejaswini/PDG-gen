import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
		int n = sc.nextInt();
		int[] numbers = new int[n];
		for (int i=0;i<n;i++) {
			numbers[i] = sc.nextInt();
		}
		int numbers_length = numbers.length;
		Set<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		for (int i = 0; i < numbers.length; i++) {
			linkedHashSet.add(numbers[i]);
		}
		int numbers_length2 =linkedHashSet.size();
		
	if(numbers_length==numbers_length2){
		System.out.println("YES");
	} else{
		System.out.println("NO");
	}
		
		//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
	}
}