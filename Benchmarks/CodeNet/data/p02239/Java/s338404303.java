import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static Map<Integer, int[]> map = new HashMap<Integer, int[]>();
    static Map<Integer, Boolean> visited = new HashMap<Integer, Boolean>();
    static List<Integer> que = new ArrayList<Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++){
            String[] s = br.readLine().split(" ");
            int u = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            int[] a = new int[k];
            for (int j = 0; j < k; j++){
                a[j] = Integer.parseInt(s[j+2]);
            }
            map.put(u, a);
            visited.put(u, false);
        }

        int[] d = new int[n + 1];
        int v = 1;
        que.add(v);
        visited.put(1, true);
        int step = 0;
        while (que.size() > 0){
            //System.out.println(que);
            v = que.remove(0);
            d[v] = step;    
            //add nextVerts to the que
            if (Objects.nonNull(map.get(v))){
                int[] nextArr = map.get(v);
                
                boolean flag = false;
                for (int j = 0; j < nextArr.length; j++){
                    if (visited.get(nextArr[j])){
                        ;
                    }else{
                        //System.out.println(que + " " +nextArr[j]+ " " +visited.get(nextArr[j])+ " " + "nextArr"+step);
                        que.add(nextArr[j]);
                        flag = true;
                        visited.put(nextArr[j], true);
                    }
                }
                if (flag){step++;}
            }
        }
            
        for (int i = 1; i < n + 1; i++){
            System.out.println(i + " " + d[i]);
        }
    }    
}