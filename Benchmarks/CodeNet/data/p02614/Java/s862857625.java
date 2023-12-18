import java.util.*;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer;

public class Main {
	public static IO fs = new IO();
	public static int h,w,k,ans;
	public static char [][] input;
	
	static void solution(int ind, String state) {
		if(state.length() == h+w) {
			//System.out.println(state);
			char [][] temp = new char[h][w];
			for(int i = 0; i<h; i++) {
				for(int j = 0; j<w; j++)temp[i][j] = input[i][j];
			}
			for(int i = 0; i<h; i++) {
				if(state.charAt(i) == '1') {
					for(int j = 0; j<w; j++)temp[i][j] = 'R';
				}
			}
			for(int i = h; i<h+w; i++) {
				if(state.charAt(i) == '1') {
					for(int j = 0; j<h; j++)temp[j][i-h] = 'R';
				}
			}
			int blackcount = 0;
			//System.out.println("for state"+" "+state);
			for(int i = 0; i<h; i++) {
				for(int j = 0; j<w; j++) {
					blackcount += (temp[i][j] == '#'? 1 : 0);
					//System.out.print(temp[i][j]+" ");
				}
				//System.out.println();
			}
			if(blackcount == k)ans+=1;
			return;
		}
		else {
			String state1 = state;
			String state2 = state;
			state1+='0';
			state2+='1';
			solution(ind+1,state1);
			solution(ind+1,state2);
			return;
		}
	}
	
	public static void solve() {
		h = fs.nextInt();w = fs.nextInt();k = fs.nextInt();
		ans = 0;
		input = new char[h][w];
		for(int i = 0; i<h; i++) {
			char [] line = fs.nextLine().toCharArray();
			for(int j = 0; j<w; j++)input[i][j] = line[j];
		}
		String state = "";
		solution(0,state);
		System.out.println(ans);
	}
	
	public static void main(String[] args) {
		int t = 1;
		//t = fs.nextInt();
		for(int cs = 0; cs<t; cs++) {
			solve();
		}
	}
	
	static class IO 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public IO() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
        
        int [] readintarray(int n) {
        	int [] ret = new int[n];
        	for(int i = 0; i<n; i++) {
        		ret[i] = nextInt();
        	}
        	return ret;
        }
        
        long [] readlongarray(int n) {
        	long [] ret = new long[n];
        	for(int i = 0; i<n; i++) {
        		ret[i] = nextLong();
        	}
        	return ret;
        }
    }
	
	public static void sort(int [] a) {
		ArrayList<Integer> temp = new ArrayList<>();
		for(int i = 0; i<a.length; i++) {
			temp.add(a[i]);
		}
		Collections.sort(temp);
		for(int i = 0; i<temp.size(); i++)a[i] = temp.get(i);
	}
	
	public static void rversesort(int [] a) {
		ArrayList<Integer> temp = new ArrayList<>();
		for(int i = 0; i<a.length; i++) {
			temp.add(a[i]);
		}
		Collections.sort(temp);
		Collections.reverse(temp);
		for(int i = 0; i<temp.size(); i++)a[i] = temp.get(i);
	}
	
	public static void longsort(long [] a) {
		ArrayList<Long> temp = new ArrayList<>();
		for(int i = 0; i<a.length; i++) {
			temp.add(a[i]);
		}
		Collections.sort(temp);
		for(int i = 0; i<temp.size(); i++)a[i] = temp.get(i);
	}
	
	public static void reverselongsort(long [] a) {
		ArrayList<Long> temp = new ArrayList<>();
		for(int i = 0; i<a.length; i++) {
			temp.add(a[i]);
		}
		Collections.sort(temp);
		Collections.reverse(temp);
		for(int i = 0; i<temp.size(); i++)a[i] = temp.get(i);
	}
	
	public static class pair implements Comparable<pair>{
		public int first;
		public int second;
		
		pair(int x,int y){
			this.first = x;
			this.second = y;
		}

		@Override
		public int compareTo(pair o) {
			if(this.first == o.first)return (this.second<=o.second?1:0);
			else return (this.first<o.second?1:0);
		}
	}
	
	public static long power(long x,long y) {
		long res = 1;
		while(y>0) {
			if(y%2 == 1)res = res*x;
			y >>= 1;
			x = x*x;
		}
		return res;
	}
	
	public static long power(long x,long y,long mod) {
		long res = 1;
		x%=mod;
		while(y>0) {
			if(y%2 == 1)res = (res*x)%mod;
			y >>= 1;
			x = (x*x)%mod;
		}
		return res;
	}
}
