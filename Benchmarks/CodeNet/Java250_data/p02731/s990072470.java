import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int M=N*N*N;
        double ans=M/27.0;
        while(Math.abs(ans*27-M)>1e-6){
            double diff=Math.abs(ans*27-M);
            if(M>27*ans) ans=ans+diff/2;
            else ans=ans-diff/2;
        }
        System.out.println(ans);
    }
}