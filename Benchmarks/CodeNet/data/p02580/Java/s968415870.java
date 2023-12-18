import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> X_map = new HashMap<>();
        Map<String, Integer> Y_map = new HashMap<>();

        String[] XPoint_array = new String[M];
        String[] YPoint_array = new String[M];

        int result = 0;

        for(int i = 0; i < M; i++) {
            String[] str_array = br.readLine().split(" ");
            
            if(X_map.get(str_array[0]) == null) {
                X_map.put(str_array[0], 1);
            } else {
                int num = X_map.get(str_array[0]) + 1;
                X_map.put(str_array[0], num);
            }

            XPoint_array[i] = str_array[0];
            YPoint_array[i] = str_array[1];
        }

        String X_maxKey = null;
        Integer X_maxValue = 0;

        for (Map.Entry<String, Integer> entry : X_map.entrySet()) {

              if (entry.getValue() > X_maxValue) {
                X_maxKey = entry.getKey();
                X_maxValue = entry.getValue();
              }
        }

        for(int j = 0; j < M; j++) {
            if(X_maxKey.equals(XPoint_array[j])) continue;
            if(Y_map.get(YPoint_array[j]) == null) {
                Y_map.put(YPoint_array[j], 1);
            } else {
                int num = Y_map.get(YPoint_array[j]) + 1;
                Y_map.put(YPoint_array[j], num);
            }
        }

        String Y_maxKey = null;
        Integer Y_maxValue = 0;

        for (Map.Entry<String, Integer> entry : Y_map.entrySet()) {

              if (entry.getValue() > Y_maxValue) {
                Y_maxKey = entry.getKey();
                Y_maxValue = entry.getValue();
              }
        }

        result = X_maxValue + Y_maxValue;
        
        pw.println(result);
        br.close();
        pw.close();
    }
}