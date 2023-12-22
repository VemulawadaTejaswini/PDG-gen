import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        long sum=0;
        for(int i=1;i<=N;i++)
            if(i%3==0 || i%5==0) continue;
            else sum+=i;
        System.out.println(sum);
    }
}
