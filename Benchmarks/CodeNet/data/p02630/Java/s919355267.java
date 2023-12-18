import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st  = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        
        long ans=0;
        HashMap<Integer, Integer> countMap = new HashMap();
        st  = new StringTokenizer(br.readLine());
        for (int i=1; i<=N; i++) {
            int x = Integer.parseInt(st.nextToken());
            countMap.put(x, countMap.getOrDefault(x, 0)+1);
            ans+=x;
        }

        st  = new StringTokenizer(br.readLine());

        int Q = Integer.parseInt(st.nextToken());

        while(Q--!=0){
            st  = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int ca = countMap.getOrDefault(a, 0);
            ans-=a*ca;
            ans+=b*ca;
            countMap.put(a, 0);
            countMap.put(b, countMap.getOrDefault(b, 0)+ca);
            System.out.println(ans);

        }


    }

}