import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		List<Integer> ms = new ArrayList<>();
		int count = n-1;
		
		for(int i=0; i<n; i++) {
			ms.add(sc.nextInt());
		}
		
		x = x - ms.stream().mapToInt(m -> m.intValue()).sum();
		int minm = ms.stream().mapToInt(m -> m.intValue()).min().getAsInt();
		
		while(x >= 0) {
			x = x - minm;
			count++;
		}
		
		System.out.println(count);
		
		sc.close();
	}
}
