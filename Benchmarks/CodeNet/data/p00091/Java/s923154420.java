import java.util.Stack;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Comparator;

class Sheet
{
	private byte n;
	private byte [][] t = new byte[10][10];
	private Stack<String> st = new Stack<String>();
	private boolean droppable[][][] = new boolean[3][10][10];
	
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
	
	public void refreshDroppable(){
		for(int a = 0; a <= 2; ++a){
			for(int i = 0; i < t.length; ++i){
				for(int j = 0; j < t[i].length; ++j){

					if( t[i][j] == 0 ){
						droppable[a][i][j] = false;
					}else{
						droppable[a][i][j] = droppable_(a,i,j);
					}
				}
			}
		}
	}
	
	private boolean droppable_(int ink, int i, int j)
	{
		for(int a = 0; a <= ink; ++a) {
			for(int[] r : inkPos[a]) {
				int ci = i + r[0];
				int cj = j + r[1];
				
				if( !isInside(ci,cj) ){
					return false;
				}
				
				if( t[ci][cj] < 1 ) {
					return false;
				}
			}
		}
		return true;
	}
	
	private boolean operateInk(int ink, int i, int j, int op)
	{
		boolean ret = false;
		for(int a = 0; a <= ink; ++a) {
			for( int[] r : inkPos[a] ) {
				int ci = i + r[0];
				int cj = j + r[1];
				
				if( op == 0 ) {
					t[ci][cj]--;
					if( t[ci][cj] == 0 ) ret = true;
				} else {
					if( t[ci][cj] == 0 ) ret = true;
					t[ci][cj]++;
				}
			}
		}
		return ret;
	}
	
	static int cnt = 0;
	static int [] ncnt = new int [20];
	
	public void solve(int pi, int pj, int pa)
	{
		/*
		++cnt;
		ncnt[n]++;
		if( cnt % 1000000 == 0 ) {
			System.out.println(cnt);
			for(int ff = 0; ff < 13; ++ff){
				System.out.print(ncnt[ ff ] + " ");
			}
			System.out.println();
		}
		*/

		/*
		if( !visited.contains(this.state) ) {
			if( Math.random()<0.25 ) {
			visited.add(this.state.clone());
			}
		} else {
			return ;
		}
		*/
		
		int maxVal = 0;
		int rem = 0;
		for(int i = 0; i < t.length; ++i) {
			for(int j = 0; j < t[i].length; ++j) {
				
				if( t[i][j] > 0 ) {
					rem+=t[i][j];
				}
				if( t[i][j] > maxVal ) {
					maxVal = t[i][j];
				}
			}
		}
		
		if( n < maxVal || 13*n < rem ) {
			return ;
		}
		
		/*
		for(int i = 0; i < state.t.length; ++i) {
			for(int j = 0; j < state.t[i].length; ++j) {
				System.out.print(state.t[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		*/
	
		if( n == 0 ){

			for(int i = 0; i < t.length; ++i) {
				for(int j = 0; j < t[i].length; ++j) {
					if( t[i][j] != 0 ) {
						return ;
					}
				}
			}
	
			while( !st.empty() ) {
				System.out.println(st.pop());
			}
			
		}else{
			
			for(int i = 0; i < t.length; ++i){
				for(int j = 0; j < t[i].length; ++j){
					
					if( t[i][j] > 0 ) {
						boolean ret = false;

						for(int a = 0; a <= 2; ++a){
							for(int[] r : inkPos[a]){
								int ci = i+r[0];
								int cj = j+r[1];

								if( isInside(ci,cj) && droppable[a][ci][cj] ){
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
			
			
			
			// for(int i = Math.max(a==0?1:a,pi); i < state.t.length-(a==0?1:a); ++i) {
			// for(int j = Math.max(a==0?1:a,i==pi?pj:1); j < state.t[i].length-(a==0?1:a); ++j) {
			for(int a = pa; a >= 0; --a){
				for(int i = a==pa?pi:1; i < 9; ++i) {
					for(int j = a==pa&&i==pi?pj:1; j < 9; ++j) {
						
						if( droppable[a][i][j] ) {
							
							// progress state
							--n;
							if( operateInk(a,i,j,0) ){
								refreshDroppable();
							}
							st.push(j+" "+i+" "+(a+1));
							
							solve( i, j, a );
							if( st.empty() ) return ;
							
							// rollback state
							++n;
							st.pop();
							if( operateInk(a,i,j,1) ){
								refreshDroppable();
							}
						}
					}
				}
			}
		}
	}
	
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextByte();
		for(byte[] f : t) {
			for(int i = 0; i < f.length; ++i){
				f[i] = sc.nextByte();
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
		sheet.refreshDroppable();
		sheet.solve( 1, 1, 2 );
	}
}