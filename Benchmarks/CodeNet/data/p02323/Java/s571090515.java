import java.util.*;
import java.io.*;

	
public class Main {
	public static void main(String[] args) throws Exception {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		
		int vn=sc.nextInt();
		int en=sc.nextInt();
		
		int[][] ds = new int[vn][vn];
		fill2(ds,INF);
		int s1=0, g1=0,d1=0;
	   	for(int i=0; i<en; i++){
	   	    s1=sc.nextInt();
	   	    g1=sc.nextInt();
	   	    d1=sc.nextInt();
	   	    ds[s1][g1] = d1;
	   	}
		
		int[][][] dp = new int[1<<vn][vn][vn];    //flag(i)の中でj始まりk終りのルートのmin(cost)
		fill3(dp, INF);
		
	   	for(int i=0; i<vn; i++){
	   	    dp[1<<i][i][i]=0;
	   	}
		
		for(int bit=0; bit < (1<<vn); bit++){
			for(int i=0; i<vn; i++){
			    if(isFlaged(bit,i)){
			        for(int j=0; j<vn; j++){
			            if(isFlaged(bit,j)){
			                int without = deflag(bit, j);
				            for(int k=0; k<vn; k++){
				                if(isFlaged(without,k)){
        			                dp[bit][i][j] = min(dp[bit][i][j], dp[without][i][k]+ds[k][j]);
				                }
				            }
			            }
			        }
			    }
			}
		}
		
		int min_route=INF, tmp=0;;
	   	for(int i=0; i<vn; i++){
			for(int j=0; j<vn; j++){
			    tmp=(dp[(1<<vn)-1][i][j]+ds[j][i]);
			    if(tmp < min_route) min_route=tmp;
			}
	   	}
        if(isINF(min_route)) out.println(-1);
        else out.println(min_route);
		
		out.flush();
	}


	private static int INF = (int)1e7;
	private static long INFL = (long)1e17;
	private static int e97 = (int)1e9 + 7;
	
	
	private static int abs(int a){
	    return (a>=0) ? a: -a;
	}
	private static long absL(long a){
	    return (a>=0) ? a: -a;
	}
	
	private static int min(int a, int b){
	    return (a>b) ? b : a;
	}
	private static long minL(long a, long b){
	    return (a>b) ? b : a;
	}
	
	private static int max(int a, int b){
		return (a>b) ? a : b;
	}
	private static long maxL(long a, long b){
		return (a>b) ? a : b;
	}
	
	private static int minN(int... ins){
		int min = ins[0];
		for(int i=1; i<ins.length; i++){
			if(ins[i] < min) min = ins[i];
		}
		return min;
	}
	private static int maxN(int... ins){
		int max = ins[0];
		for(int i=1; i<ins.length; i++){
			if(ins[i] > max) max = ins[i];
		}
		return max;
	}
	private static long minNL(long... ins){
		long min = ins[0];
		for(int i=1; i<ins.length; i++){
			if(ins[i] < min) min = ins[i];
		}
		return min;
	}
	private static long maxNL(long... ins){
		long max = ins[0];
		for(int i=1; i<ins.length; i++){
			if(ins[i] > max) max = ins[i];
		}
		return max;
	}
	
	private static int minExAd(int[] dt, int ad){
	    int min=Integer.MAX_VALUE;
		for(int i=0; i<dt.length; i++){
			if((i != ad) && (dt[i] < min)) min = dt[i];
		}
		return min;
	}
	private static int minExVal(int[] dt, int ex_val){
	    int min=Integer.MAX_VALUE;
		for(int i=0; i<dt.length; i++){
			if((dt[i] != ex_val) && (dt[i] < min)) min = dt[i];
		}
		return min;
	}
	private static long minExAdL(long[] dt, int ad){
	    long min=Long.MAX_VALUE;
		for(int i=0; i<dt.length; i++){
			if((i != ad) && (dt[i] < min)) min = dt[i];
		}
		return min;
	}
	private static long minExValL(long[] dt, long ex_val){
	    long min=Long.MAX_VALUE;
		for(int i=0; i<dt.length; i++){
			if((dt[i] != ex_val) && (dt[i] < min)) min = dt[i];
		}
		return min;
	}
	
	private static boolean same3(long a, long b, long c){
	    if(a!=b) return false;
	    if(b!=c) return false;
	    if(c!=a) return false;
	    return true;
	}
	private static boolean dif3(long a, long b, long c){
	    if(a==b) return false;
	    if(b==c) return false;
	    if(c==a) return false;
	    return true;
	}
	
	private static int factorial(int n) {
		int ans=1;
		for(int i=n; i>0; i--){
			ans*=i;
		}
		return ans;
	}
	
	private static long gcd(long m, long n) {
		if(m < n) return gcd(n, m);
		if(n == 0) return m;
		return gcd(n, m % n);
	}
	
	private static int pow2(int in){
		return in*in;
	}
	private static long pow2L(long in){
		return in*in;
	}
	
	private static int getDigit2L(long num){
		long cf = 1;
		int d=0;
		while(num >= cf){
			d++;
			cf = 1<<d;
		}
		return d;   //numはd桁の数で、2^dより小さい
	}
	
	private static int getDigit10L(long num){
		long cf = 1;
		int d=0;
		while(num >= cf){
			d++;
			cf*=10;
		}
		return d; //numはd桁の数で、10^dより小さい
	}
	
	private static boolean isINF(int in){
	    if((in*20)>INF) return true;
	    else return false;
	}
	
	private static long pow10E97(long ob, int soeji){
		if(soeji==2) return (ob*ob)%e97;
		
		int d = getDigit2L(soeji);
		long[] ob_pow_2pow = new long[d];
		
		ob_pow_2pow[0] = ob;
	   	for(int i=1; i<d; i++){
	   		ob_pow_2pow[i] = (ob_pow_2pow[i-1]*ob_pow_2pow[i-1])%e97;
	   	}
	   	
	   	long ans=1;
		for(int i=d-1; i>=0; i--){
			if(soeji >= (1<<i)){
				soeji -= (1<<i);
				ans = (ans*ob_pow_2pow[i])%e97;
			}
   		}
	   	
		return ans;
	}
	
	private static boolean isFlaged(int bit, int pos){
	    if((bit&(1<<pos)) > 0) return true;
	    else return false;
	}
	private static int deflag(int bit, int pos){
	    return bit&~(1<<pos);
	}
	
	private static void fill(int[] ob, int res){
	   	for(int i=0; i<ob.length; i++){
	   		ob[i] = res;
	   	}
	   	return;
	}
	private static void fillL(long[] ob, long res){
	   	for(int i=0; i<ob.length; i++){
	   		ob[i] = res;
	   	}
	   	return;
	}
	private static void fill2(int[][] ob, int res){
	   	for(int i=0; i<ob.length; i++){
			for(int j=0; j<ob[0].length; j++){
	   			ob[i][j] = res;
			}
	   	}
	   	return;
	}
	private static void fill2L(long[][] ob, long res){
	   	for(int i=0; i<ob.length; i++){
			for(int j=0; j<ob[0].length; j++){
	   			ob[i][j] = res;
			}
	   	}
	   	return;
	}
	private static void fill3(int[][][] ob, int res){
	   	for(int i=0; i<ob.length; i++){
			for(int j=0; j<ob[0].length; j++){
				for(int k=0; k<ob[0][0].length; k++){
    			    ob[i][j][k] = res;
				}
			}
	   	}
	   	return;
	}
	
	static void show_b2d_array(boolean[][] dt, int lit_x, int lit_y){
		for(int i=0; i<dt[0].length; i++){
			for(int j=0; j<dt.length; j++){
				if((i==lit_y) && (j==lit_x)) System.out.print("X");
				else if(dt[j][i]) System.out.print("O");
				else System.out.print(".");
			}
			System.out.println();
		}
	}
	static void show_L2(long[][] dt, String cmnt){
		PrintWriter out = new PrintWriter(System.out);
		for(int i=0; i<dt[0].length; i++){
			for(int j=0; j<dt.length; j++){
				out.print(dt[j][i]+",");
			}
			out.println("<-"+cmnt+":"+i);
		}
		out.flush();
	}
	static void disp_que(ArrayDeque<Integer> dt){		//上手くいかなかった時用
		int a=0;
		while(dt.size()>0){
			a=dt.removeLast();
			System.out.print(a);
		}
		System.out.println("\n");
	}
	
	
	private static void nextPerm(ArrayList<Integer> former){
		int pivot=-1;
		int ln = former.size();
		for(int i = ln; i>1; i--){
			if(former.get(i-2) < former.get(i-1)){
				pivot = i-2;
				break;
			}
		}
		if(pivot==-1){
		    former = null;
		    return;
		}
		int pivot_fig = former.get(pivot);
		
		int min_pos=pivot+1;
		int min=former.get(min_pos);
		for(int i=ln-1; i > pivot+1; i--){
			if((former.get(i) < min)&&(former.get(i) > pivot_fig)){
				min_pos=i;
				min=former.get(min_pos);
			}
		}
		Collections.swap(former, pivot, min_pos);
		Collections.sort(former.subList(pivot+1, ln));
		return;
	}
	
	public static int binarySearch(int[] dt, int target){
		int left=0, right=dt.length-1;
		int mid=-1;
		while(left<=right){
			mid = (right+left)/2;
			if(dt[mid] == target) return mid;
			if(dt[mid] < target) left=mid+1;
			else right=mid-1;
		}
		return -1;
	}
	public static int binarySearchMax(int[] dt, int target){
		int left=-1, right=dt.length;
		int mid=-1;
		
		while((right-left)>1){
			mid = left + (right-left)/2;
			if(dt[mid] <= target) left=mid;
			else right=mid;
		}
		return left;  //target以下の最大のaddress
	}
	
	
	static int dfs2(boolean[][] state, int x, int y, int depth){		//薄氷渡り
		int[] tmpltX = {1,-1,0,0};
		int[] tmpltY = {0,0,1,-1};
		int newX = -1, newY = -1;
		
		state[x][y] = false;
		depth++;
		
		int maxDunder_this_brunch = depth, tmpD=0;
		for(int i=0; i < 4; i++){
			newX = x+tmpltX[i];
			newY = y+tmpltY[i];
			if((newX >= 0) && (newY >= 0) && (newX < state.length) && (newY < state[0].length) && state[newX][newY]) tmpD = dfs2(state, newX, newY, depth);
			if(tmpD > maxDunder_this_brunch) maxDunder_this_brunch=tmpD;
		}
		state[x][y] = true;
		return maxDunder_this_brunch;
	}
}
 
class FastScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;
	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		}else{
			ptr = 0;
			try {
				buflen = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen <= 0) {
				return false;
			}
		}
		return true;
	}
	
	private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
	private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
	public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
	public String next() {
		if (!hasNext()) throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while(isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	public long nextLong() {
		if (!hasNext()) throw new NoSuchElementException();
		long n = 0;
		boolean minus = false;
		int b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) {
			throw new NumberFormatException();
		}
		while(true){
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			}else if(b == -1 || !isPrintableChar(b)){
				return minus ? -n : n;
			}else{
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
		return (int) nl;
	}
	public double nextDouble() { return Double.parseDouble(next());}
}
