
import java.io.*;
import java.util.*;

public class Main
{
    public static void print(String str,int val){
        System.out.println(str+"  "+val);
    }

    public long gcd(long a, long b) {
        if (b==0L) return a;
        return gcd(b,a%b);
    }

    public static void debug(long[][] arr){
        int len = arr.length;
        for(int i=0;i<len;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    public static void debug(int[][] arr){
        int len = arr.length;
        for(int i=0;i<len;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    public static void debug(String[] arr){
        int len = arr.length;
        for(int i=0;i<len;i++){
            System.out.println(arr[i]);
        }
    }

    public static void print(int[] arr){
        int len = arr.length;
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print('\n');
    }
    public static void print(String[] arr){
        int len = arr.length;
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print('\n');
    }
    public static void print(long[] arr){
        int len = arr.length;
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print('\n');
    }

    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }
        public FastReader(String path) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(path));
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
    }


    public static void main(String[] args)
    {
        FastReader s=new FastReader();
        int n = s.nextInt();
        int k= s.nextInt();
        int[] arr = new int[n];
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
            if(arr[i]>=0){
                pos.add(arr[i]);
            }
            else {
                neg.add(arr[i]);
            }
        }
        Collections.sort(pos,Collections.reverseOrder());
        Collections.sort(neg);
        long mod = (long)(1e9+7);
        long[] pos_pref = new long[pos.size()+1];
        long[] neg_pref = new long[neg.size()+1];
        pos_pref[0] =1;
        for(int i=1;i<=pos.size();i++){
            pos_pref[i] = (pos_pref[i-1]*1L*(pos.get(i-1)))%mod;
            pos_pref[i]%=mod;
        }
        neg_pref[0] = 1;
        for(int i=1;i<=neg.size();i++){
            neg_pref[i] = (neg_pref[i-1]*1L*neg.get(i-1))%mod;
            neg_pref[i]%=mod;
        }
        long ans =Long.MIN_VALUE;
        for(int i=0;i<(k/2);i=i+2){
            if(k-2*i<=pos.size() && 2*i<=neg.size()){
                long temp = (pos_pref[k-2*i]*neg_pref[2*i])%mod;
                ans = Math.max(temp,ans);
            }
        }
        if(pos.size()>=k){
            ans = Math.max(ans,pos_pref[k]);
        }
        if(neg.size()>=k){
            ans = Math.max(ans,neg_pref[k]);
            long temp = 1;
            for(int i=0;i<k;i++){
                temp = (temp*neg.get(neg.size()-1-i))%mod;
            }
            ans = Math.max(ans,temp);
        }
        ans = ((ans%mod)+mod)%mod;
        //consider case all are negative
        System.out.println(ans);

    }



//    OutputStream out = new BufferedOutputStream( System.out );
//        for(int i=1;i<n;i++){
//    out.write((arr[i]+" ").getBytes());
//}
//        out.flush();

    //  long start = System.currentTimeMillis();
//  long end = System.currentTimeMillis();
//  System.out.println((end - start) + "ms");



}
