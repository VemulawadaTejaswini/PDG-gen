import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        long x = Long.parseLong(st.nextToken());
        st = new StringTokenizer(br.readLine());
        long[] arr = new long[(int)n];
        for (int i=0; i<n; i++) {
            arr[i]=Long.parseLong(st.nextToken());
        }
        long ans = 0;
        if(arr[0]>x){
            ans+=arr[0]-x;
            arr[0]=x;
        }
        for (int i=1; i<n; i++) {
            if(arr[i-1]+arr[i]>x){
                ans+=arr[i-1]+arr[i]-x;
                arr[i]=arr[i]-(arr[i-1]+arr[i]-x);
            }
        }
        // for (int i=0; i<n; i++) {
        //     System.out.print(arr[i]+",");
        // }
        // System.out.println();

        System.out.println(ans);

        
    }
}
