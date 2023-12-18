import java.util.*;

public class Main {
	int h, w, n;
	char[][] map, input;
	boolean flag;
	
	void func(){
		boolean[][] f;
		boolean out;
		int cnt;
		
		while(true){
			drop();
			out = false;
			f = new boolean[h][w];
			for(int i=0;i<h;i++){
				for(int j=1;j<w;j++){
					cnt = 1;
					while(j<w && map[i][j-1]!='.' && map[i][j-1]==map[i][j]){
						j++;
						cnt++;
					}
					if(cnt>=n){
						for(int k=0;k<cnt;k++) f[i][j-1-k] = true;
					}
				}
			}
			for(int i=0;i<w;i++){
				for(int j=1;j<h;j++){
					cnt = 1;
					while(j<h && map[j-1][i]!='.' && map[j-1][i]==map[j][i]){
						j++;
						cnt++;
					}
					if(cnt>=n){
						for(int k=0;k<cnt;k++) f[j-1-k][i] = true;
					}
				}
			}
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					if(f[i][j]==true){
						map[i][j] = '.';
						out = true;
					}
				}
			}
			if(out==false) break;
		}
	}
	
	void drop(){
		int cnt;
		char[] a;
		
		for(int j=0;j<w;j++){
			cnt = 0;
			a = new char[h];
			Arrays.fill(a, '.');
			for(int i=0;i<h;i++){
				if(map[i][j]!='.'){
					a[cnt] = map[i][j];
					map[i][j] = '.';
					cnt++;
				}
			}
			for(int i=0;i<h;i++) map[i][j] = a[i];
		}
	}
	
	boolean finish(){
		boolean f = true;
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				if(map[i][j]!='.') f = false;
				map[i][j] = input[i][j];
			}
		}
		return f;
	}
	
	void solve(){
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		w = sc.nextInt();
		n = sc.nextInt();
		map = new char[h][w];
		input = new char[h][w];
		for(int i=0;i<h;i++){
			input[h-1-i] = sc.next().toCharArray();
			Arrays.fill(map[i], ' ');
		}
		
		flag = finish();
		for(int i=0;i<h;i++){
			for(int j=0;j<w-1;j++){
				if(map[i][j]=='.' && map[i][j+1]=='.') continue;
				char a = map[i][j];
				map[i][j] = map[i][j+1];
				map[i][j+1] = a;
				func();
				flag = finish();
				if(flag==true) break;
			}
			if(flag==true) break;
		}
		
		if(flag==true) System.out.println("YES");
		else System.out.println("NO");
	}
	
	
	public static void main(String[] args) {
		new Main().solve();
	}	
}