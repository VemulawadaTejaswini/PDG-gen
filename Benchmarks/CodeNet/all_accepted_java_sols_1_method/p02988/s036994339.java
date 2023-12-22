import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(in.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int res = 0;
        for (int i = 1; i < n-1; i++) {
            if (arr[i] > arr[i-1] && arr[i] < arr[i+1]) {
                res++;
            } else if (arr[i] < arr[i-1] && arr[i] > arr[i+1]){
                res++;
            }
        }
        System.out.println(res);
    }

}
/*


 */