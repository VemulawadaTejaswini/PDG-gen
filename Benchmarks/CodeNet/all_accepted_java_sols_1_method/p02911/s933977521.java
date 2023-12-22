import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        int n = Integer.parseInt(st.nextToken());
        long k = Long.parseLong(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        int[] right = new int[n+1];
        for(int i = 1; i<=q; i++){
            st = new StringTokenizer(br.readLine());
            int ind = Integer.parseInt(st.nextToken());
            right[ind]++;
        }
        for(int i = 1; i<=n; i++){
            if(k - q + right[i] > 0){
                pw.println("Yes");
            }
            else{
                pw.println("No");
            }
        }
        pw.close();
    }
}