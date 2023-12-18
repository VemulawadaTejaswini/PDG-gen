import java.util.*;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer;

public class Main {
    public static long mod = 1_000_000_00_7;
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
        int [] readarray(int sz){
            int [] ret = new int[sz];
            for(int i = 0; i<sz; i++)ret[i] = nextInt();
            return ret;
        }
    } 
    public static void main(String[] args){
        IO fs = new IO();
        int n = fs.nextInt(),k = fs.nextInt();
        long [] a = new long[n];
        for(int i = 0; i<n; i++){
            long x = fs.nextLong();
            x = (x%mod+mod)%mod;
            a[i] = x;
        }
        sort(a);
        long ans = 1;
        for(int i = 0; i<k; i++)ans = ((ans*a[i])%mod+mod)%mod;
        System.out.println(ans);
    }
    static void sort(long[] a) {
		ArrayList<Long> l=new ArrayList<>();
		for (long i:a) l.add(i);
        Collections.sort(l);
        Collections.reverse(l);
		for (int i=0; i<a.length; i++) a[i]=l.get(i);
	}
}
