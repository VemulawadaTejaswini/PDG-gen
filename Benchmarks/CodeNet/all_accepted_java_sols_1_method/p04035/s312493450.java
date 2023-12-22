/**
 * Created by abhishek on 7/31/2016.
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int array[] = new int[n + 1];
        int node = -1;
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
            if (i == 1) continue;
            if (array[i] + array[i - 1] >= l) {
                node = i;
            }
        }
        if (node == -1) {
            System.out.println("Impossible");
            return;
        }
        System.out.println("Possible");
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < node - 1; i++) {
            sb.append(i);
            sb.append('\n');
        }
        for(int i = n - 1;i >= node;i--){
            sb.append(i);
            sb.append('\n');
        }
        sb.append(node - 1);
        System.out.println(sb);
    }
}
