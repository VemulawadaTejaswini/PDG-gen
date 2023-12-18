
import java.util.*;
public class Main {
	public int wcnt(int now[], int to[]) {
		int wcnt = 0;
		int x = to[0]-now[0];
		int y = to[1]-now[1];
		if(x > 0 && y > 0 || x < 0 && y < 0) { 
			x = Math.abs(x); y = Math.abs(y); wcnt = Math.max(x, y); 
		} else { 
			x = Math.abs(x); y = Math.abs(y); wcnt = x+y;
		}
		return wcnt;
	}
	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int[] now = new int[2];
		int[] to = new int[2];
		int cnt = 0;
		sc.nextInt();
		sc.nextInt();
		int n = sc.nextInt();
		now[0] = sc.nextInt();
		now[1] = sc.nextInt();
		for(int i = 1; i < n; i++) {
			to[0] = sc.nextInt();
			to[1] = sc.nextInt();
			cnt += wcnt(now,to);
			to[0] = now[0];
			to[1] = now[1];
		}
		System.out.println(cnt);
	}
	public static void main(String[] args) {
		new Main().doIt();
	}
}