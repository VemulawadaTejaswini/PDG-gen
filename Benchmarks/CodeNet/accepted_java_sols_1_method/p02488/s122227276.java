import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		List<String> num = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			num.add(sc.next());
		}
		
		Collections.sort(num);
		
		System.out.println(num.get(0));
	}
}