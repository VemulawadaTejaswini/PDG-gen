import java.io.*;
import java.util.*;
 
public class Main {
    static final long MOD = 1000000007L;
    static final int INF = 50000000;
    static final int NINF = -50000000;
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);
        
        int N = sc.ni();
        int K = sc.ni();
        long[] negs = new long[N];
        long[][] nums = new long[N][2];
        boolean zero = false;
        for (int i = 0; i < N; i++) {
        	long n = sc.nl();
        	nums[i][0] = Math.abs(n);
        	if (n != 0)
        		nums[i][1] = nums[i][0]/n;
        	else
        		zero = true;
        	negs[i] = nums[i][0];
        }
        nums = sort(nums);
        long negIn = -1;
        long posIn = -1;
        int sign = 1;
        long prod = 1;
        for (int i = 0; i < K; i++) {
        	if (nums[i][1]==1) {
        		posIn = nums[i][0];
        	} else if (nums[i][1]==-1) {
        		negIn = nums[i][0];
        	}
        	sign *= nums[i][1];
        	prod = (prod*nums[i][0])%MOD;
        }
        long negOut = -1;
        long posOut = -1;
        for (int i = N-1; i >= K; i--) {
        	if (nums[i][1]==1) {
        		posOut = nums[i][0];
        	} else if (nums[i][1]==-1) {
        		negOut = nums[i][0];
        	}
        }
        
        if (sign >= 0) {
        	pw.println(prod);
        } else {
        	boolean possible = false;
        	if (negIn > 0 && negOut > 0 && posIn > 0 && posOut > 0) {
        		if (negOut*negIn >= posOut*posIn) {
        			prod = (prod*negOut)%MOD;
        			prod = (prod*power(posIn,MOD-2,MOD))%MOD;
        		} else {
        			prod = (prod*posOut)%MOD;
        			prod = (prod*power(negIn,MOD-2,MOD))%MOD;
        		}
        		possible = true;
        	} else if (negIn > 0 && posOut > 0) {
    			prod = (prod*posOut)%MOD;
    			prod = (prod*power(negIn,MOD-2,MOD))%MOD;
    			possible = true;
        	} else if (posIn > 0 && negOut > 0) {
    			prod = (prod*negOut)%MOD;
    			prod = (prod*power(posIn,MOD-2,MOD))%MOD;
    			possible = true;
        	}
        	
        	if (possible) {
        		pw.println(prod);
        	} else if (zero) {
        		pw.println(0);
        	} else {
        		//the answer will be negative
        		Arrays.sort(negs);
        		long ans = 1L;
        		for (int i = 0; i < K; i++) {
        			ans = (ans*negs[i])%MOD;
        		}
        		pw.println(MOD-ans);
        	}
        }
        
        pw.close();
    }
    
    //Fast exponentiation (x^y mod m)
    public static long power(long x, long y, long m) {
    	long ans = 1;
    	x %= m;
    	while (y > 0) {
    		if((y&1)==1)
    			ans = (ans * x) % m;
    		y /= 2;
    		x = (x * x) % m;
    	}
    	return ans;
    }
    
    public static long[][] sort(long[][] arr) {
    	//Sort an array (immune to quicksort TLE)
    	Random rgen = new Random();
    	for (int i = 0; i < arr.length; i++) {
    		int randomPosition = rgen.nextInt(arr.length);
    		long[] temp = arr[i];
    		arr[i] = arr[randomPosition];
    		arr[randomPosition] = temp;
    	}
    	Arrays.sort(arr, new Comparator<long[]>() {
    		@Override
    		public int compare(long[] arr1, long[] arr2) {
    			if (arr1[0] < arr2[0])
    				return 1;
    			else
    				return -1;

    			//Ascending order.
    		}
    	});
    	return arr;
    }
    
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
 
        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
 
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int ni() {
            return Integer.parseInt(next());
        }
 
        long nl() {
            return Long.parseLong(next());
        }
 
        double nd() {
            return Double.parseDouble(next());
        }
 
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}