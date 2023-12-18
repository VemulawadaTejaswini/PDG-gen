import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N=Integer.parseInt(sc.next());
		long a = 1;
		List<Long> aList = new ArrayList();
		for(int i=0;i< N; i++) {
			long b = Long.parseLong(sc.next());
			if(b == 0) {
				System.out.println(0);
				return;
			}
			aList.add(b);
		}
		for(Long aa :aList) {
			a *= aa;
			if(a > 1000000000000000000L) {
				System.out.println(-1);
				return;
			}
		}
		System.out.println(a);
	}
}
