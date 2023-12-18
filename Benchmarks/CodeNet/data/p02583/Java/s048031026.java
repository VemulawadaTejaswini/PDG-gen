import java.util.*;
import java.io.*;

class Main
{
    public static void main(String[] args) throws IOException{
        PrintWriter out = new PrintWriter(System.out);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());


        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int ans = 0;
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                if (arr[i]==arr[j]) {
                    continue;
                }
                for (int k=j+1; k<n; k++) {
                    if (arr[j]==arr[k] || arr[i]==arr[k]) {
                        continue;
                    }
                    if (arr[j]+arr[k]>arr[i] && arr[i]+arr[k]>arr[j] && arr[i]+arr[j]>arr[k]) {
                        ans++;
                    }
                }
            }
        }

        out.println(ans);

        out.close();
    }

    

}
