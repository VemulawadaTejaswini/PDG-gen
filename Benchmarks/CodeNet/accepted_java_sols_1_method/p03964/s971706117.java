import java.util.*;
import java.io.*;
class Main {
    static long ans=0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        
        long a=1;
        long b=1;

        for(long i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            long ra=Long.parseLong(st.nextToken());
            long rb=Long.parseLong(st.nextToken());
            if(ra>=a && rb>=b){
                a=ra;
                b=rb;
                continue;
            }
            else{
                long l=Math.max(a/ra,b/rb);
                // long l=1;
                long tmpa=ra*l,tmpb=rb*l;
                while(tmpa<a || tmpb<b){
                    l++;
                    tmpa=ra*l;
                    tmpb=rb*l;
                }
                a=tmpa;
                b=tmpb;
            }
            
        }

        System.out.println(a+b);
    }
}