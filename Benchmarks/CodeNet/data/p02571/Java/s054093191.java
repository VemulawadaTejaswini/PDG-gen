import java.io.*;
import java.util.*;

public class Main{
    final static String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toLowerCase();//.toCharArray();
    static class FastReader{
        BufferedReader br,br1;
        StringTokenizer st;
        public FastReader(){br = new BufferedReader(new InputStreamReader(System.in));}
        public FastReader(String fileName) throws FileNotFoundException{br = new BufferedReader(new FileReader(fileName));}
        String next(){while (st == null || !st.hasMoreElements()){try{st = new StringTokenizer(br.readLine());}catch (IOException  e){e.printStackTrace();}}return st.nextToken();}
        int nextInt(){return Integer.parseInt(next());}
        long nextLong(){return Long.parseLong(next());}
        double nextDouble(){return Double.parseDouble(next());}
        char[][] readCharArray(int n,int m) {
        	String str;
        	char[][] arr = new char[n][m];
        	for(int i=0;i<n;i++) {
        		str=nextLine();
        		for(int j=0;j<n;j++) {
        			arr[i][j]=str.charAt(j);
        		}
        	}
        	return arr;
        }
        char[][] readCharArray(int n){
        	return readCharArray(n,n);
        }
        int[] readArray(int n){int[] a=new int[n];for (int i=0; i<n; i++) a[i]=nextInt();return a;}
        long[] readLongArray(int n){long[] a=new long[n];for (int i=0; i<n; i++) a[i]=nextLong();return a;}
        String nextLine(){String str = "";try{str = br.readLine();}catch (IOException e){e.printStackTrace();}return str;}
    }
    static int getGcd(int n1,int n2){
        while(n1 != n2){
            if(n1 > n2) n1 -= n2;
            else n2 -= n1;
        }
        return n1;
    }
    static boolean isSorted(int[] arr, int n){
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]) return false;
        }
        return true;
    }
    static boolean isPrime(long n){
        if(n==2) return true;
        else if(n%2==0) return false;
        for(int i=3;i<=n/2;i+=2){
            if(n%i==0) return false;
        }
        return true;
    }
    static boolean isPrime(int n){
        if(n==2) return true;
        else if(n%2==0) return false;
        for(int i=3;i<=n/2;i+=2){
            if(n%i==0) return false;
        }
        return true;
    }
    static void printArray(int[] arr){
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }
    static long Fact(int n){
        //int p=1000000007;
        long result = 1;
        for (int i = 1; i <= n; i++) result = (result*i);
        //for (int i = 1; i <= n; i++) result = (result*i)%p;
        return result;
    }
    static final Random random=new Random();
    static void ruffleSort(int[] a) {
        int n=a.length;//shuffle, then sort
        for (int i=0; i<n; i++) {
            int oi=random.nextInt(n), temp=a[oi];
            a[oi]=a[i]; a[i]=temp;
        }
        Arrays.sort(a);
    }
    static int maxDigit(int n) {
    	int ret=n%10;
    	while(n/10!=0) {
    		ret = Math.max(ret, n%10);
    		n/=10;
    	}ret = Math.max(ret, n%10);
    	return ret;
    }
    static int getDiff(String str,String sub) {
    	int count=0;
    	for(int i=0;i<str.length();i++) {
    		if(str.charAt(i)!=sub.charAt(i)) count++;
    	}
    	return count;
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        //long time = System.currentTimeMillis();
    	FastReader s = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        String str = s.nextLine();
        String sub = s.nextLine();
        int strlen = str.length();
        int sublen = sub.length();
        int min = 1000;
        for(int i=0;i<(strlen-sublen+1);i++) {
        	min = Math.min(min,getDiff(str.substring(i,i+sublen),sub));
        }
        out.println(min);
        out.close();
        //System.err.println(System.currentTimeMillis()-time);
    }
}