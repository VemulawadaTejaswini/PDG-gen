import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> x = new ArrayList<>();
		List<Integer> y = new ArrayList<>();
		
		x.add(Integer.MIN_VALUE);
		y.add(Integer.MIN_VALUE);
		
		int cnt = 0;
		
		while(x.get(cnt) != 0 || y.get(cnt) != 0) {
			x.add(sc.nextInt());
			y.add(sc.nextInt());
			
			cnt++;
			
			if(x.get(cnt) == 0 && y.get(cnt) == 0) {
				break;
			}
		}
		
		for(int i = 1; i < cnt; i++) {
			if(x.get(i) > y.get(i)) {
				System.out.println(y.get(i) + " " + x.get(i));
			} else {
				System.out.println(x.get(i) + " " + y.get(i));
			}
		}
	}
}