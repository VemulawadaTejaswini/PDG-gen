import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		List<Integer> h = new ArrayList<Integer>();
		List<Integer> good = new ArrayList<Integer>();

		for(int i = 0;i < n;i++) {
			h.add(sc.nextInt());
			good.add(1);
		}

		for(int i = 0;i < m;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(h.get(a - 1) > h.get(b - 1)) {
				good.set(b - 1, 0);
			}else if(h.get(a - 1).intValue() == h.get(b - 1).intValue()){
				good.set(b - 1, 0);
				good.set(a - 1, 0);
			}else {
				good.set(a - 1, 0);
			}
		}

		int count = 0;
		for(int i = 0;i < n;i++) {
			if(good.get(i) == 1) {
				count++;
			}
		}

		System.out.println(count);
	}
}