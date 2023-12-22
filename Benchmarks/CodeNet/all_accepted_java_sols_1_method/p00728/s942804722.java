import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);
        
        /* ????????????(????????????????????????????????£??????????????°n)??????????????? */
        String buf = reader.readLine();
        int n = Integer.parseInt(buf);
        
        while (true) {
            int[] point;
            point = new int[n];
            
            /* n???(??????????????????????????°s)??????????????? */
            for (int i = 0; i < n; i++) {
                buf = reader.readLine();
                point[i] = Integer.parseInt(buf);
            }
            
            int max = 0, min = 1000, sum = 0;
            for (int i = 0; i < n; i++) {
                if (point[i] < min) {
                    min = point[i];
                }
                if (point[i] > max) {
                    max = point[i];
                }
                sum += point[i];
            }
            sum -= min;
            sum -= max;
            System.out.println(sum / (n - 2));
            
            buf = reader.readLine();
            n = Integer.parseInt(buf);
            if (n < 2) {
                break;
            }
        }
    }
}