import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> al = new ArrayList<>();
		
		int cnt = 0;
		al.add(Integer.MIN_VALUE);
		
		while(al.get(cnt) != 0) {
			al.add(sc.nextInt());
			cnt++;
		}
		
		for(int i = 0; i < cnt - 1; i++) {
			System.out.println("Case " + (i + 1) + ": " + al.get(i + 1));
		}
	}
}