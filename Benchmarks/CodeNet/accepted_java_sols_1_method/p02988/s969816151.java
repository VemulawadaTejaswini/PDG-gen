import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		List<Integer> list = new ArrayList();
		for(int i=0; i<n ; i++) {
			list.add(Integer.parseInt(sc.next()));
		}

		int count = 0;
		for(int i=1; i<list.size()-1; i++) {
			int a=list.get(i-1);
			int b=list.get(i);
			int c=list.get(i+1);
			if((b < a && b >= c) || (b < c && b >= a)) {
				count++;
			}
		}
		System.out.println(count);

	}
}
