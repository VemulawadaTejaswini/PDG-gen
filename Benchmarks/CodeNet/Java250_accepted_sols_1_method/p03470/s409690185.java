import java.util.*;

public class Main {

	public static void main(String... nui) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> set = new HashSet<>();
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) set.add(sc.nextInt());
		
		System.out.println(set.size());
		
	}

}