import java.util.*;
public class Main{
	public void solve(){
		Scanner sc = new Scanner(System.in);
		int[] pos = new int[20];
		int[] d = new int[20];
		int[] exit = new int[20];
		while(true){
			int N = sc.nextInt();
			int L = sc.nextInt();
			if(N == 0 && L == 0) break;
			for(int i = 0; i < N; i++){
				d[i] = sc.next().equals("L") ? -1 : 1;
				pos[i] = sc.nextInt();
			}
			boolean flg = true;
			int time = 0;
			while(flg){
				flg = false;
				time++;
				for(int i = 0; i < N; i++){
					if(pos[i] != -1){
						pos[i] += d[i];
						if(pos[i] == 0 || pos[i] == L){
							pos[i] = -1;
							exit[i] = time;
						}else{
							flg = true;
						}
					}
				}
				for(int i = 0; i < N; i++){
					if(pos[i] == -1) continue;
					for(int j = i + 1; j < N; j++){
						if(pos[j] == -1) continue;
						if(pos[i] == pos[j]){
							d[i] *= -1;
							d[j] *= -1;
						}
					}
				}
			}
			int last = 0;
			int li = 0;
			for(int i = 0; i < N; i++){
				if(exit[i] > last){
					li = i;
					last = exit[i];
				}else if(exit[i] == last && d[i] == -1){
					li = i;
					last = exit[i];
				}
			}
			System.out.println(last + " " + (li + 1));
		}
	}
	
	public static void main(String[] args){
		new Main().solve();
	}
}