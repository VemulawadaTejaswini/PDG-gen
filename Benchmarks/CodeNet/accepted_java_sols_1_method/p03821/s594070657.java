import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        long[] a=new long[n];
        long[] b=new long[n];
        StringTokenizer st;
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            a[i]=Integer.parseInt(st.nextToken());
            b[i]=Integer.parseInt(st.nextToken());
        }
        long count=0;
        for(int i=n-1;i>=0;i--){
            //System.out.println(count);
            a[i]+=count;
            while(a[i]%b[i]!=0){
                count+=(b[i]-a[i]%b[i]);
                a[i]+=(b[i]-a[i]%b[i]);
            }//System.out.println(Arrays.toString(a)+"\n"+Arrays.toString(b));
        }System.out.println(count);
    }
}