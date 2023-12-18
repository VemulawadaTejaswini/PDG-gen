import java.io.*;
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
        long a=sc.nextLong();
        long b=100;
        int ans=0;
        for(int i=0;;i++){
            b*=1.01;
            ans++;
            if(b>=a){
                System.out.println(ans);
                break;
            }
        }
    }
}
