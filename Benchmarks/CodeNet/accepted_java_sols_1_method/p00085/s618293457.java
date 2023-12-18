import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n == 0 && m == 0) break;
			List<Integer> list = new ArrayList<Integer>();
			int idx = m - 1;
			for(int i = 0; i < n; i++) {
				list.add(i + 1);
			}
			while(list.size() > 1){
				int l = list.size();
				idx = idx % l;
				list.remove(idx);
				idx += m - 1;
			}
			System.out.println(list.get(0));

		}
		sc.close();
	}
}
