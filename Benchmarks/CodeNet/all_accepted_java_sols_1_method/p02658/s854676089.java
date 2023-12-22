
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    private static final long MAX = 1000000000000000000L;
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());
        long pdt = 1;
        String[] tokens = br.readLine().split(" ");
        long arr[] = new long[n];
        int i=0;
        for(i=0;i<n;i++){
            arr[i] = Long.parseLong(tokens[i]);
        }
        Arrays.sort(arr);
        for(i=0;i<n;i++){
            if(arr[i]!=0 && pdt>MAX/arr[i]){
                break;
            }
            pdt*=arr[i];
        }
        if(i<n)
            System.out.println(-1);
        else
            System.out.println(pdt);
    }


}