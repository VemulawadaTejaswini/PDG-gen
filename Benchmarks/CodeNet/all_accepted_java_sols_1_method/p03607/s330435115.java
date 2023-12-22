import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Set<Integer> list = new HashSet<>();
 
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if (list.contains(a)) {
				list.remove(a);
			} else {
				list.add(a);
			}
		}
 
		System.out.println(list.size());
 
		sc.close();
    }
}
