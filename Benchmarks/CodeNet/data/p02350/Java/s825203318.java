import java.util.*;
import java.io.*;

class Method {
	public void update(ArrayList<Integer> a, int s, int t, int x) {
		for (int i = s; i <= t; i++) {
			a.set(i, x);
		}
	}

	public int find(ArrayList<Integer> a, int s, int t) {
		int min = (int)Math.pow(2, 31) - 1;
		for(int i = s; i <= t; i++) {
			if(min > a.get(i)) {
				min = a.get(i);
			}
		}
		return min;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();

		ArrayList<Integer> a = new ArrayList<>();
		for(int i=0; i<n; i++) {
			a.add((int)Math.pow(2, 31) - 1);
		}

		ArrayList<Integer> com = new ArrayList<>();
		ArrayList<Integer> s = new ArrayList<>();
		ArrayList<Integer> t = new ArrayList<>();
		ArrayList<Integer> x = new ArrayList<>();

		for(int i=0; i<q; i++) {
			int tmp = sc.nextInt();
			if(tmp == 0) {
				com.add(tmp);
				s.add(sc.nextInt());
				t.add(sc.nextInt());
				x.add(sc.nextInt());
			} else {
				com.add(tmp);
				s.add(sc.nextInt());
				t.add(sc.nextInt());
				x.add(0);
			}
		}

		for(int i=0; i<q; i++) {
			Method methodmachine = new Method();
			if(com.get(i) == 0) {
				methodmachine.update(a, s.get(i), t.get(i), x.get(i));
			} else {
				int rst = methodmachine.find(a, s.get(i), t.get(i));
				System.out.println(rst);
			}
		}

	}

}