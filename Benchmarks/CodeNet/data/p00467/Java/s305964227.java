import java.util.*;
import java.util.regex.Pattern;
public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if((n|m) == 0) break;
			int [] mass = new int[n + 7];
			for(int i = 0; i < n; i++){
				mass[i] = sc.nextInt();
			}
			int [] sai = new int[m];
			for(int i = 0;i < m; i++){
				sai[i] = sc.nextInt();
			}
			int now = 0;
			int ans = m;
			for(int i = 0; i < m; i++){
				now += sai[i];
				if(now >= n){
					ans = i + 1;
					break;
				}
				now += mass[now];
			}
			System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}