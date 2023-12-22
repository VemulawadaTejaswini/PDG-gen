import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong(), M = sc.nextLong();
		List<Long> l = new ArrayList<>(), r = new ArrayList<>();
		for(int i = 0; i < M; i++) {
			l.add(sc.nextLong());
			r.add(sc.nextLong());
		}
		Collections.sort(l);
		Collections.sort(r);
		
		Long left = l.get(l.size()-1);
		Long right = r.get(0);
		
		Long ans = right-left+1;
		if(right >= left)System.out.println(ans);
		else System.out.println(0);
		
	}
}