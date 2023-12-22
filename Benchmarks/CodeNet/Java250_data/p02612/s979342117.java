import java.io.*;
import java.util.*;

 
public class Main {            
    static StringBuilder out=new StringBuilder();
    static FastReader in=new FastReader();
    public static int[] getIntArray(int n){
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        return arr;
    }
 
    static int  mod=(int)1e9 +7;
    static int [][]dp;
    
    
    public static void solve(){
        int n=in.nextInt();
        out.append((1000-(n%1000))%1000);
    }

    public static void main(String args[]){
        int t=1;
        while(t-->0){
            solve();
            out.append('\n');
        }
        System.out.println(out);
    }
}
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
class FastReader {
    BufferedReader br;
    StringTokenizer st;
 
    public FastReader() {
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
 
    int nextInt() {
        return Integer.parseInt(next());
    }
 
    long nextLong() {
        return Long.parseLong(next());
    }
 
    double nextDouble() {
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

class tree{
    int n, t[];
    public tree(int arr[]){
        n=arr.length;
        t=new int[n*4];
        build(arr, 1,0,n-1);
    }
    public int build(int arr[],int i,int l,int r){
        if(l==r){
            t[i]=arr[l];
            return 1;
        }
        int mid=l+(r-l)/2;
        int h=Math.min(build(arr,i*2,l,mid),build(arr,i*2+1,mid+1,r));
        if(h%2==0){
            t[i]=t[i*2] ^ t[i*2 +1 ];
        }else{
            t[i]=t[i*2] | t[i*2 + 1];
        }
        return ++h;
    }
    public int update(int i, int l,int r, int p,int b){
        if(l==r){
            t[i]=b;
            return 1;
        }
        int mid=l+(r-l)/2;
        int h=0;
        if(p>mid){
            h=update(i*2+1,mid+1,r,p,b);
        }else{
            h=update(i*2,l,mid,p,b);
        }
        if(h%2==0){
            t[i]=t[i*2] ^ t[i*2 +1 ];
        }else{
            t[i]=t[i*2] | t[i*2 + 1];
        }
        return ++h;
    }
}