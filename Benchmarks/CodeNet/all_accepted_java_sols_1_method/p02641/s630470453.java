import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = Integer.parseInt(sc.next());
		int N = Integer.parseInt(sc.next());
		List<Integer> list = new ArrayList();
		for(int i=1; i<=N; i++) {
			list.add(Integer.parseInt(sc.next()));
		}
		Collections.sort(list);

		int n1 = Integer.MAX_VALUE;
		int n2 = Integer.MAX_VALUE;
		for(int i=X; i<=101; i++) {
			if(!list.contains(i)) {
				n1=i;
				break;
			}
		}
		for(int i=X;i >=0;i--) {
			if(!list.contains(i)) {
				n2=i;
				break;
			}
		}
		System.out.println(Math.abs(X-n2)<= Math.abs(n1-X)? n2:n1);
	}
}
