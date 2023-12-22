import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> l = new ArrayList<>();
		int sum = 0;
		int num;
		for(int i = 0; i < n; i++) {
			num = sc.nextInt();
			l.add(num);
			sum += num;
		}
		if(sum > Collections.max(l) * 2) {
			System.out.println("Yes");
		} else {
		    System.out.println("No");
		}
	}
}