import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.lang.reflect.Array;
        import java.math.BigInteger;
        import java.util.*;
        import java.lang.*;

public class  Main {
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;

        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next(){
            while(st==null || !st.hasMoreElements()){
                try{
                    st=new StringTokenizer(br.readLine());
                }
                catch(IOException e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt(){
            return Integer.parseInt(next());
        }

        Long nextLong(){
            return Long.parseLong(next());
        }

        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str="";
            try{
                str=br.readLine();
            }
            catch(IOException e){
                e.printStackTrace();
            }
            return str;
        }
    }
    static int gcd(int a,int b){
        if(b==0){
            return a;
        }else{
            return gcd(b,a%b);
        }
    }
    public static void main(String[] args) {
        FastReader in = new FastReader();
        int k=in.nextInt();
        long sum=0;
        for(int i=1;i<=k;i++){
            for(int j=1;j<=k;j++){
                int a =gcd(i,j);
                for(int m =1;m<=k;m++){
                    sum+=gcd(a,m);
                }
            }
        }
        System.out.println(sum);
    }
}
