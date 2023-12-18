import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        FastScanner fs=new FastScanner();
        int n=fs.nextInt();
        int m=fs.nextInt();
        HashMap<Integer, HashSet<Integer>>map=new HashMap<Integer, HashSet<Integer>>();
        for(int i=1;i<=n;i++)map.put(i,new HashSet<>());
        for (int tt=0; tt<m; tt++){
            int a=fs.nextInt();
            int b=fs.nextInt();
            map.get(a).add(b);
            map.get(b).add(a);
        }
        int max = 0;
        ArrayList<Integer>connectedCount=new ArrayList<>();
        Set<Integer> seen = new HashSet<Integer>();
        for(int j = 1;j<=n;j++){

            if (!seen.contains(j)){

                Stack<Integer> dfs = new Stack<Integer>();
                dfs.add(j);
                Set<Integer> tempseen = new HashSet<Integer>();
                while(!dfs.isEmpty()){
                    int vertex = dfs.pop();
                    for(int child : map.get(vertex)){
                        if (!tempseen.contains(child))
                            dfs.add(child);
                    }
                    tempseen.add(vertex);
                    seen.add(vertex);
                }
                connectedCount.add(tempseen.size());

            }

        }
        int size=n;
        int ans=0;
        while(size!=0) {
            for (int i = 0; i < connectedCount.size(); i++) {
                if (connectedCount.get(i) == 0) {
                    continue;
                }
                connectedCount.set(i, connectedCount.get(i) - 1);
                size--;
            }
            ans++;
        }
        System.out.println(ans);



    }
    static class FastScanner {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");
        String next() {
            while (!st.hasMoreTokens())
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
        int[] readArray(int n) {
            int[] a=new int[n];
            for (int i=0; i<n; i++) a[i]=nextInt();
            return a;
        }
        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
