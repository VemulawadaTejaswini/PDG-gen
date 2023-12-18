import java.util.Stack;
import java.util.Scanner;

class Sheet
{
	private Integer n;
	private Integer [][] t = new Integer[10][10];
	private Stack<String> st = new Stack<String>();
	
	private final static int[][][] inkPos = 
	{
		{
			{-1, 0} , {1, 0} , {0,-1} , {0, 1}, {0,0}
		},
		{
			{-1,-1} , {-1,1} , {1,-1} , {1, 1}
		},
		{
			{-2, 0} , {0, 2} , {2, 0} , {0,-2}
		}
	};
	
	
	private boolean isInside(int i, int j)
	{
		return i<10 && j<10 && i>=0 && j>=0;
	}
	
	private boolean droppable(int ink, int i, int j)
	{
		for(int a = 0; a <= ink; ++a) {
			for(int[] r : inkPos[a]) {
				int ci = i + r[0];
				int cj = j + r[1];
				
				if( !isInside(ci,cj) ){
					return false;
					//continue;
				}
				
				if( t[ci][cj] < 1 ) {
					return false;
				}
			}
		}
		return true;
	}
	
	private void operateInk(int ink, int i, int j, int op){
		for(int a = 0; a <= ink; ++a){
			for(int[] r : inkPos[a] ){
				int ci = i + r[0];
				int cj = j + r[1];
				
				if( op == 0 ) {
					t[ci][cj]--;
				}else{
					t[ci][cj]++;
				}
			}
		}
	}
	static int cnt = 0;
	
	public void solve()
	{
		++cnt;
		
		if( cnt % 100000 == 0 ) {
			System.out.println(cnt);
		}
		
		for(int i = 0; i < t.length; ++i){
			for(int j = 0; j < t.length; ++j){
				
				if( t[i][j] > 0 ) {
					boolean ret = false;

					for(int a = 0; a <= 2; ++a){
						for(int[] r : inkPos[a]){
							int ci = i+r[0];
							int cj = j+r[1];

							if( droppable(a,ci,cj) ){
								ret = true;
							}
						}
					}
					
					if( !ret ) {
						return ;
					}
				}
			}
		}
		
		if( n == 0 ){
			for(int i = 0; i < t.length; ++i){
				for(int j = 0; j < t[i].length; ++j){
					if( t[i][j] != 0 ) return ;
				}
			}
			while(!st.empty()){
				System.out.println(st.pop());
			}
		}else{
			// 0 : small -> 2 : large
			for(int a = 2; a >= 0; --a){
				for(int i = a==0?1:a; i < t.length-(a==0?1:a); ++i){
					for(int j = a==0?1:a; j < t[i].length-(a==0?1:a); ++j){
						if( droppable(a,i,j) ){
							
							// progress state
						
							--n;
							
							operateInk(a,i,j,0);
							// System.out.println(n + " " + a + " " + i + " " + j);
							/*
							for(int ii = 0; ii < 10; ++ii){
								for(int jj = 0; jj < 10; ++jj){
									System.out.print(t[ii][jj]);
								}
								System.out.println();
							}
							*/
							
							st.push(j+" "+i+" "+(a+1));

							solve();
							if( st.empty() ) return ;
						
							
							// rollback state
							++n;
							st.pop();
							operateInk(a,i,j,1);
						}
					}
				}
			}
		}
	}
	
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		for(Integer[] f : t) {
			for(int i = 0; i < f.length; ++i){
				f[i] = sc.nextInt();
			}
		}
	}
}

class Main
{
	public static void main(String [] args)
	{
		Sheet sheet = new Sheet();
		sheet.input();
		sheet.solve();
	}
	
}