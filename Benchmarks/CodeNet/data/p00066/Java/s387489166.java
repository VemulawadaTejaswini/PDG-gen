import java.util.Arrays;
import java.util.Scanner;

class Main{
	int[][] f;
	
	String solve(){
		// ヨコ
		for(int y=0; y<3; ++y){
			int t = f[y][0];
			if(t==0)continue;
			boolean b = true;
			for(int x=0; x<3; ++x){
				b &= t==f[y][x];
			}
			if(b){
				return t==1 ? "o" : "x";
			}
		}
		
		// タテ
		for(int x=0; x<3; ++x){
			int t = f[0][x];
			if(t==0)continue;
			boolean b = true;
			for(int y=0; y<3; ++y){
				b &= t==f[y][x];
			}
			if(b){
				return t==1 ? "o" : "x";
			}
		}
		
		// ナナメ右下
		{
			int t = f[0][0];
			if(t!=0){
				boolean b = true;
				for(int x=0; x<3; ++x){
					b &= t == f[x][x];
				}
				if(b){
					return t==1 ? "o" : "x";
				}
			}
		}
		
		// ナナメ右上
		{
			int t = f[2][0];
			if(t!=0){
				boolean b = true;
				for(int x=0; x<3; ++x){
					b &= t == f[3-1-x][x];
				}
				if(b){
					return t==1 ? "o" : "x";
				}
			}
		}
		
		return "d";
	}
	
	void io(){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			f = new int[3][3];
			char[] str = sc.next().toCharArray();
			
			for(int i=0; i<9; ++i){
				f[i/3][i%3] = str[i]=='s' ? 0 : str[i]=='o' ? 1 : -1;
			}
			
			System.out.println(solve());
		}
	}
	
	public static void main(String[] args){
		new Main().io();
	}
	
	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}
}