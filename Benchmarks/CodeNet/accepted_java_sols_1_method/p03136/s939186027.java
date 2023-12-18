import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> l = new ArrayList<>();
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			l.add(sc.nextInt());
		}
		l.sort(null);
		int sum = 0;
		for(int a:l) {
			sum = sum + a;
		}
		if(sum - l.get(l.size()-1)>l.get(l.size()-1)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");			
		}
	}
}
