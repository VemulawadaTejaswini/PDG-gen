import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        InputReader in=new InputReader(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int k=in.nextInt();
        if(a>k)
            out.println(k);
        else{
            int res=0;
            res+=a;
            k-=a;
            if(b>k) {
                res += k;
                k=0;
            }
            else
                k-=b;
            res+=-k;
            out.println(res);
        }
        out.flush();
    }
    static class InputReader{
        private BufferedReader in;
        private StringTokenizer tokenizer;
        public InputReader(InputStream stream){
            in = new BufferedReader(new InputStreamReader(stream),32768);
            tokenizer = null;
        }
        public String next() throws IOException{
            while(tokenizer==null || !tokenizer.hasMoreTokens()){
                tokenizer = new StringTokenizer(in.readLine());
            }
            return tokenizer.nextToken();
        }
        public Long nextLong() throws IOException {
            String next = next();
            return Long.valueOf(next);
        }
        public int nextInt() throws IOException{
            return Integer.valueOf(next());
        }
    }
}