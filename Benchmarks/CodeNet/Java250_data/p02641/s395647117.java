import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		Set<Integer> p = new HashSet<>();
		for (int i = 0; i < n; i++) {
			p.add(sc.nextInt());
		}
		
		int distance = 0;
		while(true) {
			if(p.contains(Integer.valueOf(x - distance)) == false) {
				System.out.println(x - distance);
				break;
			} else if(p.contains(Integer.valueOf(x + distance)) == false) {
				System.out.println(x + distance);
				break;
			}
			distance++;
		}
	}
}
