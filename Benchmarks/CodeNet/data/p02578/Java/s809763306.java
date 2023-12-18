import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String []args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int []arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int sum=0;
        for (int i = 0; i < n-1; i++) {
            int j=i+1;
            while (j<n&&arr[i]>=arr[j]){
                sum+=(arr[i]-arr[j]);
                arr[j]+=(arr[i]-arr[j]);
                j++;
            }
        }
        System.out.println(sum);
    }
}
