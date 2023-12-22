import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < k; i++) {
			int snack = sc.nextInt();
			for (int j = 0; j < snack; j++) {
				int people = sc.nextInt();
				// System.out.println("people: " + people);
				set.add(people);
			}
		}
		System.out.println(n - set.size());
	}
}

 
 

 
 
 
 
