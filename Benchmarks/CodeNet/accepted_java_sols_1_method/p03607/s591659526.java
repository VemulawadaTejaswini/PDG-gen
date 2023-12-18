import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i = 1; i<=N; i++) {
			int n = sc.nextInt();
			if(set.contains(n)) set.remove(n);
			else set.add(n);
		}
		
		System.out.println(set.size());
	}

}
