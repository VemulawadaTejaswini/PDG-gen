import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    /*public static StreamTokenizer in;
    static {
        try{
            in = new StreamTokenizer(new BufferedReader(new InputStreamReader(new BufferedInputStream(System.in))));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static int nextInt() throws IOException{ in.nextToken(); return (int)in.nval; }*/
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        int n=sc.nextInt();
        int k=sc.nextInt();
        int count[]=new int[n+1];
        while(k-->0){
            int d=sc.nextInt();
            while(d-->0){
                int p=sc.nextInt();
                count[p]++;
            }
        }
        int ans=0;
        for(int i=1;i<=n;i++){
            if(count[i]==0)
                ans++;
        }
        System.out.println(ans);

    }
}
