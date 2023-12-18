
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {


	Scanner sc = new Scanner(System.in);

	@SuppressWarnings("unchecked")
	void run() {
		for (;;) {

			int n = sc.nextInt();
			int d = sc.nextInt();

			if (n + d == 0) {
				break;
			}

			// int data[][] = new int[n][];
			LinkedList<Integer> data[] = new LinkedList[n];
			int sum[] = new int[n];
			for (int i = 0; i < n; i++) {
				int m = sc.nextInt();
				data[i] = new LinkedList<Integer>();
				for (int j = 0; j < m; j++) {
					int c = sc.nextInt();
					data[i].add(c);
					sum[i] += c;
				}
//				data[i].add(0);
			}

			// System.out.println(n + " " +a.size());
			boolean ret = true;
			for (;;) {
				int index = -1;
				int diff = Integer.MAX_VALUE;
				int max = 0;
				int min = Integer.MAX_VALUE;
				
				for (int i = 0; i < n; i++) {
					if(data[i].isEmpty()){
						min = 0;
						continue;
					}
					min = Math.min(min, sum[i]);
					if(max== sum[i]){	
						if(diff > data[i].peekFirst()){
							diff  = data[i].peekFirst();
							index= i;
							max = sum[i];
						}
					}else if(max < sum[i]){
						index= i;
						max = sum[i];
						diff = Integer.MAX_VALUE;
					}
				}
				
				if(max - min > d){
					ret = false;
					break;
				}
				
				if(index==-1){
					ret = true;
					break;
				}
				sum[index] -= data[index].pollFirst();
			}
			if (ret) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}