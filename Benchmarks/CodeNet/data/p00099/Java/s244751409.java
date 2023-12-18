import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		new Main().mainrun();
	}

	private Scanner scan;

	private int n,q,top_id;
	private long top_value;
	private long[] list;

	private void mainrun() {
		scan = new Scanner(System.in);

		n = scan.nextInt();
		q = scan.nextInt();

		list = new long[n+1];
		Arrays.fill(list,0);

		list[0] = Integer.MIN_VALUE;

		top_id =  0;
		top_value = Integer.MIN_VALUE;

		for(int i = 0;i < q;i++) {
			int a = scan.nextInt();
			int v = scan.nextInt();

			list[a] += v;

			if(a == top_id && v > 0) {
				top_value = list[a];

			}else if(a != top_id && v > 0){
				if(list[top_id] < list[a] || (list[top_id] == list[a] && top_id > a)) {
					top_id = a;
					top_value = list[a];
				}

			}else if(a == top_id && v < 0){
				top_id = 0;
				top_value = list[0];
				int cnt = 0;

				for(long l : list) {
					if(top_value < l) {
						top_id = cnt;
						top_value = l;
					}
					cnt++;
				}

			}else if(a != top_id && v < 0){
				/* */

			}

			System.out.println(top_id + " " + top_value);
		}

		scan.close();
	}
}
