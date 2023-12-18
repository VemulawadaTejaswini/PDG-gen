import java.util.Stack;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Comparator;

class State implements Comparable<State> {
	public Byte n;
	public Byte [][] t = new Byte[10][10];
	
	@Override
	public int compareTo(State b){
		if( n != b.n ) {
			return n-b.n;
		} else {
			for(int i = 0; i < t.length; ++i){
				for(int j = 0; j < t[i].length; ++j){
					if( t[i][j] != b.t[i][j] ){
						return t[i][j]-b.t[i][j];
					}
				}
			}
		}
		return 0;
	}
	
	public State clone(){
		State st = new State();
		st.n = n;
		st.t = new Byte[10][10];
		for(int i = 0; i < st.t.length; ++i){
			for(int j = 0; j < st.t[i].length; ++j){
				st.t[i][j] = t[i][j];
			}
		}
		return st;
	}
}

class Sheet
{
	private State state;
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
				}
				
				if( state.t[ci][cj] < 1 ) {
					return false;
				}
			}
		}
		return true;
	}
	
	private void operateInk(int ink, int i, int j, int op)
	{
		for(int a = 0; a <= ink; ++a) {
			for(int[] r : inkPos[a] ) {
				int ci = i + r[0];
				int cj = j + r[1];
				
				if( op == 0 ) {
					state.t[ci][cj]--;
				} else {
					state.t[ci][cj]++;
				}
			}
		}
	}
	
	static int cnt = 0;
	
	TreeSet<State> visited = new TreeSet<State>();

	public void solve()
	{
		++cnt;
		//if(cnt%20000==0)System.out.println(cnt+" "+visited.size());
		
		if( !visited.contains(this.state) ){
			if(Math.random()*2<1){
				visited.add(this.state.clone());
			}
		} else {
			return ;
		}

		int maxVal = 0;
		for(int i = 0; i < state.t.length; ++i){
			for(int j = 0; j < state.t.length; ++j){
				
				// if( state.t[i][j] > 0 && state.t[i][j] < minVal ) minVal = t[i][j];
				
				if( state.t[i][j] > maxVal ) {
					maxVal = state.t[i][j];
				}
			}
		}
		
		if( state.n < maxVal ) return ;
	
		if( state.n == 0 ){
			for(int i = 0; i < state.t.length; ++i) {
				for(int j = 0; j < state.t[i].length; ++j) {
					if( state.t[i][j] != 0 ) {
						return ;
					}
				}
			}
			while( !st.empty() ) {
				System.out.println(st.pop());
			}
		}else{
			
			int minVal = 13;
			for(int i = 0; i < state.t.length; ++i){
				for(int j = 0; j < state.t.length; ++j){
					
					// if( state.t[i][j] > 0 && state.t[i][j] < minVal ) minVal = t[i][j];
					
					if( state.t[i][j] > 0 ) {
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

			// System.out.println(minVal);
			
			// 0 : small -> 2 : large
			for(int a = 2; a >= 0; --a){
				for(int i = a==0?1:a; i < state.t.length-(a==0?1:a); ++i){
					for(int j = a==0?1:a; j < state.t[i].length-(a==0?1:a); ++j){
						
						//if( t[i][j] != minVal ) continue;
						
						if( droppable(a,i,j) ){
							
							// progress state
							--state.n;
							
							operateInk(a,i,j,0);
							
							/*
							System.out.println(n + " " + a + " " + i + " " + j);
							
							for(int ii = 0; ii < 10; ++ii){
								for(int jj = 0; jj < 10; ++jj){
									System.out.print(t[ii][jj] + " ");
								}
								System.out.println();
							}
							*/
							
							st.push(j+" "+i+" "+(a+1));

							solve();
							if( st.empty() ) return ;
						
							
							// rollback state
							++state.n;
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
		state = new State();
		Scanner sc = new Scanner(System.in);
		
		state.n = sc.nextByte();
		for(Byte[] f : state.t) {
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
		sheet.solve();
	}
	
}