import java.util.Scanner;


public class Main{

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int[] values = new int[a];
		for(int i=0 ; i<values.length ; i++) {
			values[i] = s.nextInt();
		}
		solve(values);
	}

	public static void solve(int[] values) {
		boolean flg = true;
		int cnt = 0;
		while(flg) {
			flg = false;
			for(int i = values.length - 1 ; i > 0 ; i--) {
				if(values[i] < values[i-1]) {
					int tmp = values[i];
					values[i] = values[i-1];
					values[i-1] = tmp;
					cnt++;
					flg = true;
				}
			}
		}
		String disp = "";
		for(int i=0 ; i<values.length ; i++) {
			disp += values[i];
			if(i+1<values.length)
				disp += " ";
		}
		System.out.print(disp+"\n");
		System.out.println(cnt);
	}
}