import java.util.Stack;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Comparator;

class Sheet
{
	private byte n;
	private byte [][] t = new byte[10][10];
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
					// drop ink
					t[ci][cj]--;
					if( t[ci][cj] == 0 ) ret = true;
				} else {
					// remove ink
					if( t[ci][cj] == 0 ) ret = true;
					t[ci][cj]++;
				}
			}
		}
		return ret;
	}
	
	public void solve(int pi, int pj, int pa)
	{
		
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

		// the number of remaining operations is enough to clear
		if( n < maxVal || 13*n < rem ) {
			return ;
		}
		
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

								if( droppable_(a,ci,cj) ) {
									ret = true;
								}
							}
						}
						
						// exist a cell that cannot be zero by dropping ANY inks around there.
						if( !ret ) {
							return ;
						}
					}
				}
			}
			
			for(int a = pa; a >= 0; --a){
				for(int i = a==pa?pi:1; i < 9; ++i) {
					for(int j = a==pa&&i==pi?pj:1; j < 9; ++j) {
						
						if( droppable_(a,i,j) ){
							
							// progress state
							--n;
							operateInk(a,i,j,0);
							st.push(j+" "+i+" "+(a+1));
							
							solve( i, j, a );
							if( st.empty() ) return ;
							
							// rollback state
							++n;
							st.pop();
							operateInk(a,i,j,1) ){
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
		sheet.solve( 1, 1, 2 );
	}
}