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
        st = new StringTokenizer(f.readLine());
        for(int i = 0; i < n; i++){
            long elem = Long.parseLong(st.nextToken());
            if(elem > 0) pos.add(elem);
            else neg.add(elem);
        }
        Collections.sort(pos, Comparator.reverseOrder());
        Collections.sort(neg);
        long prod = 1L;
        if(pos.size() == 0 && k % 2 == 1){
            for(int i = neg.size()-1; i > neg.size()-1-k; i--){
                prod*=neg.get(i);
                prod%=MOD;
                prod+=MOD;
                prod%=MOD;
            }
        }else if(k % 2 == 1){
            int a = 0;
            int b = 0;
            for(int i = 0; i < k-1; i+=2){
                long prod1 = -1;
                long prod2 = -1;
                if(a+2 < pos.size()) prod1 = pos.get(a)*pos.get(a+1);
                if(b+1 < neg.size()) prod2 = neg.get(b)*neg.get(b+1);
                if(prod1 > prod2){
                    prod*=pos.get(a);
                    prod%=MOD;
                    prod+=MOD;
                    prod%=MOD;
                    prod*=pos.get(a+1);
                    prod%=MOD;
                    prod+=MOD;
                    prod%=MOD;
                    a+=2;
                }else{
                    prod*=neg.get(b);
                    prod%=MOD;
                    prod+=MOD;
                    prod%=MOD;
                    prod*=neg.get(b+1);
                    prod%=MOD;
                    prod+=MOD;
                    prod%=MOD;
                    b+=2;
                }
            }
            prod*=pos.get(a);
            prod%=MOD;
            prod+=MOD;
            prod%=MOD;
        }else{
            int a = 0;
            int b = 0;
            for(int i = 0; i < k; i+=2){
                long prod1 = -1;
                long prod2 = -1;
                if(a+1 < pos.size()) prod1 = pos.get(a)*pos.get(a+1);
                if(b+1 < neg.size()) prod2 = neg.get(b)*neg.get(b+1);
                if(prod1 > prod2){
                    prod*=pos.get(a);
                    prod%=MOD;
                    prod+=MOD;
                    prod%=MOD;
                    prod*=pos.get(a+1);
                    prod%=MOD;
                    prod+=MOD;
                    prod%=MOD;
                    a+=2;
                }else{
                    prod*=neg.get(b);
                    prod%=MOD;
                    prod+=MOD;
                    prod%=MOD;
                    prod*=neg.get(b+1);
                    prod%=MOD;
                    prod+=MOD;
                    prod%=MOD;
                    b+=2;
                }
            }
        }
        out.println(prod);
        out.close();
    }
}
