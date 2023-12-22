import java.util.*;
import java.io.*;



public class Main{
    static boolean[] vis;                       //line 74 and 91 hasElement ans pth_fnd
    static int MOD=1000000007;
    //
    static int[] ans;
    static int cnt;
    static long set1=0,set2=0;
    //
    public static void main(String[] args) throws IOException{
        // long sttm=System.currentTimeMillis();
        FastReader sc=new FastReader();
        OutputStream out=new BufferedOutputStream(System.out);
        int s=sc.nextInt(),w=sc.nextInt();
        if(w>=s){
            System.out.println("unsafe");
        }
        else{
            System.out.println("safe");
        }
        

    }


    public static long pow(long n,long k){                 //n-pow(k)
        if(k==1){
            return n%MOD;
        }
        if(k==0){
            return 1;
        }
        long val=pow(n,k/2)%MOD;
        if(k%2==0)return ((val%MOD)*(val%MOD))%MOD;
        else return (((val*val)%MOD)*n)%MOD;
    }


    public static ArrayList<Integer> lcm(int num){
        ArrayList<Integer> arrl=new ArrayList<Integer>();
        while(num%2==0){
            arrl.add(2);
            num/=2;
        }
        for(int i=3;i*i<=num;i+=2){
            while(num%i==0){
                arrl.add(i);
                num/=i;
            }
        }
        if(num>2){
            arrl.add(num);
        }
        return arrl;
    }


    static long m=998244353l;
    static long modInverse(long a,long m) 
    { 
        long m0 = m;
        long y = 0l, x = 1l; 
  
        if (m == 1) 
            return 0l; 
  
        while (a > 1) 
        { 
  
            long q = a / m; 
  
            long t = m; 
  
            m = a % m; 
            a = t; 
            t = y; 
  
            y = x - q * y; 
            x = t; 
        } 
        if (x < 0) 
            x += m0; 
  
        return x; 
    }


    public static int num_fact(int num){
        ArrayList<Integer> arr=new ArrayList<Integer>();
        int cnt=0;
        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                if(i*i==num){
                    cnt+=1;
                }
                else{
                    cnt+=2;
                }
            }
        }
        return cnt;
    }


    public static void sort_inc(int[][] arr,int col){        //change dimention if req
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(final int[] entry1,final int[] entry2) { 
                if (entry1[col] > entry2[col])              //this is for inc
                    return 1; 
                else if(entry1[col]==entry2[col])
                    return 0;
                else
                    return -1; 
            }
        });
    }


    public static boolean prime(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }


    static long gcd(long a, long b) 
	{ 
	if (b == 0) 
		return a; 
	return gcd(b, a % b); 
	} 
}


class FastReader{ 
    BufferedReader br; 
    StringTokenizer st; 

    public FastReader(){ 
        br = new BufferedReader(new
                 InputStreamReader(System.in)); 
    } 
  
    String next(){ 
        while (st == null || !st.hasMoreElements()){ 
            try{ 
                st = new StringTokenizer(br.readLine()); 
            } 
            catch (IOException  e){ 
                e.printStackTrace(); 
            } 
        } 
        return st.nextToken(); 
    } 
  
    int nextInt(){ 
        return Integer.parseInt(next()); 
    } 
  
    long nextLong(){ 
        return Long.parseLong(next()); 
    }
  
    double nextDouble(){ 
        return Double.parseDouble(next()); 
    }
  
    String nextLine(){ 
        String str = ""; 
        try{ 
            str = br.readLine(); 
        }
        catch (IOException e){ 
            e.printStackTrace(); 
        }
        return str; 
    }
}