
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException{
        process();
    }
    public static void process() throws IOException{
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(in.readLine());
        long pro=1;
        StringTokenizer st=new StringTokenizer(in.readLine());
        long arr[]=new long[n];
        for(int i=0;i<n;i++)
            arr[i]=Long.parseLong(st.nextToken());
        long o=(long)(Math.pow(10,18));
        boolean flag=true;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            pro*=arr[i];
            if(pro==0)
                break;
            if(pro>o || pro<0){
                flag=false;
                break;
            }
        }
        if(flag)
            System.out.println(pro);
        else
            System.out.println("-1");
    }
}
