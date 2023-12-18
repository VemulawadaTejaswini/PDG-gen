import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
            
            String line;
            int count = 0;
            int nc = 0;
            int mc = 0;
            int n = 1;
            int m = 1;
            ArrayList<Integer> matrix = new ArrayList<Integer>();
            ArrayList<Integer> vector = new ArrayList<Integer>();
            
            while((line = stdReader.readLine()) != null) {
                // ????????????n??¨m?????????
                if(count == 0) {
                    String[] array = line.split(" ", 0);
                    n = Integer.parseInt(array[0]);
                    m = Integer.parseInt(array[1]);
                    count++;
                    continue;
                }
                
                // ?????????????????????
                if(nc < n) {
                    String[] row = line.split(" ", 0);
                    for(int i = 0; i < m; i++) {
                       matrix.add(Integer.parseInt(row[i]));
                    }
                    nc++;
                    continue;
                }
                
                // ???????????????????????????
                if(mc < m) {
                    vector.add(Integer.parseInt(line));
                    mc++;
                    if(mc != m) {
                        continue;
                    }
                }
                int c = 0;
                for(int i = 0; i < n; i++) {
                    int ans = 0;
                    for(int j = 0; j < m; j++) {
                        ans += matrix.get(c) * vector.get(j);
                        c++;
                    }
                    System.out.println(ans);
                }
                count = 0;
                nc = 0;
                mc = 0;
                matrix.clear();
                vector.clear();
            }
            stdReader.close();
        } catch(Exception e) {
            System.out.println(e);
            e.getStackTrace();
            System.exit(-1);
        }
    }
}