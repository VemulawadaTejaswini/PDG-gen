import java.util.*;
import java.io.*;

public class Main {
    public static long MOD = 1000000007L;
    public static void main(String[] args) throws IOException{
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st  = new StringTokenizer(f.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        ArrayList<Long> pos = new ArrayList<Long>();
        ArrayList<Long> neg = new ArrayList<Long>();
        Long[] arr = new Long[n];
        st = new StringTokenizer(f.readLine());
        long currp = 1L;
        for(int i = 0; i < n; i++){
            long elem = Long.parseLong(st.nextToken());
            arr[i] = elem;
            currp*=elem;
            currp%=MOD;
            currp+=MOD;
            currp%=MOD;
            if(elem > 0) pos.add(elem);
            else neg.add(elem);
        }
        if(k == n){
            out.println(currp);
            out.close();
            System.exit(0);
        }
        Collections.sort(neg);
        long prod = 1L;
        if(pos.size() == 0 && k % 2 == 1){
            for(int i = neg.size()-1; i > neg.size()-1-k; i--){
                prod*=neg.get(i);
                prod%=MOD;
                prod+=MOD;
                prod%=MOD;
            }
            out.println(prod);
            out.close();
            System.exit(0);
        }
        Arrays.sort(arr);
        int a = 0;
        int b = n-1;
        if(k % 2 == 1){
            prod*=arr[b];
            prod%=MOD;
            prod+=MOD;
            prod%=MOD;
            b--;
            k--;
        }

        k/=2;
        for(int i = 0; i < k; i++){
            long left = arr[a]*arr[a+1];
            long right = arr[b]*arr[b-1];
            if(left > right){
                prod*=arr[a];
                prod%=MOD;
                prod+=MOD;
                prod%=MOD;
                prod*=arr[a+1];
                prod%=MOD;
                prod+=MOD;
                prod%=MOD;
                a+=2;
            }else{
                prod*=arr[b];
                prod%=MOD;
                prod+=MOD;
                prod%=MOD;
                prod*=arr[b-1];
                prod%=MOD;
                prod+=MOD;
                prod%=MOD;
                b-=2;
            }
        }




        out.println(prod);
        out.close();
    }
}
