import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		Set<Integer> ch = new HashSet<>();
		
		for(int i=0;i<n;i++) {
			int d=sc.nextInt();
			ch.add(d);
		}

		if(n==ch.size()) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
		sc.close();
	}
}