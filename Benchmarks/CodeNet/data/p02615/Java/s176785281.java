import java.util.*;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer;

public class Main {
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
        int n = fs.nextInt();
        int [] a = fs.readarray(n);
        Arrays.sort(a);
        //PriorityQueue<Integer> pq = new PriorityQueue<Integer> (new Comparator<Integer> () {public int compare(Integer a, Integer b) {return b - a;}});
        int ans = a[n-1];
        int j = n-2;
        for(int i = n-2; i>=0;i-=2){
            if(i-1>=0){
                //i-=1;
                ans+=a[j];
            }
            if(i-2>=0){
                //i-=1;
                ans+=a[j];
            }
            j-=1;
        }
        System.out.println(ans);
    }
}
