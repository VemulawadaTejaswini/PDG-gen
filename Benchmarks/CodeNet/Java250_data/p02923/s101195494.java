import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        
        int n = sc.nextInt();
        int[] H = new int[n];
        for(int i=0;i<n;i++){
            H[i]=sc.nextInt();
        }

        int ans=0;
        int tmp=0;

        for(int j=1; j<n; j++){
            if(H[j-1]>=H[j]){
                tmp++;
            }
            else{
                tmp=0;
            }
            if(tmp>=ans){
                ans=tmp;
            }
        }

        System.out.println(ans);

    }

    static class MyScanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 15);
        StringTokenizer tokenizer;
    
        String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(reader.readLine());
                }
            } catch (IOException ignored) {
            }
            return tokenizer.nextToken();
        }
    
        int nextInt() {
            return Integer.parseInt(next());
        }
    
        long nextLong() {
            return Long.parseLong(next());
        }
    }
}