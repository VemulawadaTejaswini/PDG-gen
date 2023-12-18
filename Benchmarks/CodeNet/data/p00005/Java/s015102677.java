import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(true){
            try{
            StringTokenizer st=new StringTokenizer(br.readLine()," ");
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            int gcd=GCD(a,b);
            long lcm=LCM(a,b,gcd);
            System.out.println(gcd+" "+lcm);
            }catch(Exception e){
                System.exit(0);
            };
        }
    }
    
    static int GCD(int a,int b){
        while(a!=b){
            if(a<b) b-=a;
            else a-=b;
        }return a;
    }
    
    static long LCM(int a,int b,int gcd){
        return ((long)a*b)/gcd;
    }
    
}