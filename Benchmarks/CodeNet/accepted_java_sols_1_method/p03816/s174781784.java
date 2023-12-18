import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Integer n = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        HashSet<Integer> distinct = new HashSet<>();
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            distinct.add(arr[i]);
        }
        int d = distinct.size();
        int ans = 0;
        if (n%2==1){
            if (d%2==1)
                ans = d;
            else
                ans = d-1;
        }
        else{
            if (d%2==0)
                ans = d;
            else
                ans = d-1;
        }
        System.out.println(ans);
    }


}
