import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        int[] T = new int[N];
        st = new StringTokenizer(br.readLine());
        int sum=0;
        for(int i=0; i<N; i++){
            T[i]=Integer.parseInt(st.nextToken());
            sum+=T[i];
        }

        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int P = Integer.parseInt(st.nextToken());
            int X = Integer.parseInt(st.nextToken());
            System.out.println(sum-T[P-1]+X);
        }


    }

}
