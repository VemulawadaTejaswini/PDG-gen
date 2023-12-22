import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> a = new ArrayList<>(n);
		int i;
		for(i = 0; i < n; i++) {
			a.add(sc.nextInt());
		}
		sc = null;
		int min, amari;
		min = Collections.min(a);
		while(true) {
			ArrayList<Integer> b = new ArrayList<>();
			for(i = 0; i < n; i++) {
				amari = a.get(i) % min;
				if(amari > 0) b.add(amari);
			}
			if(b.size() == 0) break;
			min = Collections.min(b);
			b = null;
		}
		System.out.println(min);
	}

}
