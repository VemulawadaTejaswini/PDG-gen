import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int C = sc.nextInt();
		int time[][] = new int[N][3];
		Boolean flag[] = new Boolean[N];
		Arrays.fill(flag, false);
		
		for(int i = 0; i < N; i++) {
			time[i][0] = sc.nextInt();
			time[i][1] = sc.nextInt();
			time[i][2] = sc.nextInt();
		}
		
		Arrays.sort(time, Comparator.comparingInt(o -> o[0]));
		
		int ans = 0;
		while(Arrays.asList(flag).contains(false)) {
			ans++;
			int t = 0;
			int c = -1;
			for(int i = 0; i < N; i++) {
				if(flag[i]) continue;
				if(time[i][2] == c || c == -1) {
					if(t <= time[i][0]) {
						flag[i] = true;
						t = time[i][1];
						c = time[i][2];
					}
				} else {
					if(t < time[i][0]) {
						flag[i] = true;
						t = time[i][1];
						c = time[i][2];
					}
				}
			}
		}
		
		System.out.println(ans);
	}
}
