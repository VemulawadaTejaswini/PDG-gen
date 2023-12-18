import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(br.readLine());
            // int n = 3;
            Map<String, List<List<Integer>>> map = new HashMap<String, List<List<Integer>>>(){{
                put("1", Arrays.asList(Arrays.asList(0,0,0,0,0,0,0,0,0,0), Arrays.asList(0,0,0,0,0,0,0,0,0,0), Arrays.asList(0,0,0,0,0,0,0,0,0,0)));
                put("2", Arrays.asList(Arrays.asList(0,0,0,0,0,0,0,0,0,0), Arrays.asList(0,0,0,0,0,0,0,0,0,0), Arrays.asList(0,0,0,0,0,0,0,0,0,0)));
                put("3", Arrays.asList(Arrays.asList(0,0,0,0,0,0,0,0,0,0), Arrays.asList(0,0,0,0,0,0,0,0,0,0), Arrays.asList(0,0,0,0,0,0,0,0,0,0)));
                put("4", Arrays.asList(Arrays.asList(0,0,0,0,0,0,0,0,0,0), Arrays.asList(0,0,0,0,0,0,0,0,0,0), Arrays.asList(0,0,0,0,0,0,0,0,0,0)));
            }};
            for(int i=0; i<n; i++){
                String[] arr = br.readLine().split(" ");
                String b = arr[0];
                int r = Integer.parseInt(arr[1]), f = Integer.parseInt(arr[2]), v = Integer.parseInt(arr[3]);
                map.get(b).get(r-1).set(f-1, map.get(b).get(r-1).get(f-1) + v);
            }
            for (Map.Entry<String, List<List<Integer>>> entry : map.entrySet()) {
                entry.getValue().forEach(row -> {
                    row.forEach(t -> {
                       System.out.printf(" %d", t);
                    });
                    System.out.println();
                });
                if (!entry.getKey().equals("4")) {
                    System.out.println("####################");
                }
            }
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
