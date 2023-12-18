import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String[] s = sc.next().split(",");
			int[] l = new int[10];
			int sum = 0;
			for(int i = 0; i < 10; i++) {
				l[i] = Integer.parseInt(s[i]);
				sum += l[i];
			}
			int[]seg = new int[sum + 1];
			int idx = 0;
			int k = l[0];
			for(int i = 0; i <= sum; i++) {
				if(i <= k) {
					seg[i] = idx;
				}else {
					idx++;
					k += l[idx];
					seg[i] = idx;
				}
			}
			double v1 = Double.parseDouble(s[10]);
			double v2 = Double.parseDouble(s[11]);
			double h = (double)(sum * v1 )/ (v1 + v2);
			int id = (int)Math.ceil(h);
			System.out.println(seg[id] + 1);
		}

	}
}
