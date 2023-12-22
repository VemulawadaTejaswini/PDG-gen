
import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        long[] arr = new long[N];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++)
            arr[i] = Long.parseLong(st.nextToken());
        Arrays.sort(arr);

        long res = 1;
        for (int i=0; i<N; i++){
            try{
                res = Math.multiplyExact(res,arr[i]);
            }
            catch (Exception e){
                res = -1;
                break;
            }
            if (res>1000000000000000000L){
                res=-1;
                break;
            }
            if(res==0){
                break;
            }

        }
        System.out.println(res);

    }



}
