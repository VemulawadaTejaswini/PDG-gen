import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while ((line = in.readLine()) != null) {
            String[] strs = line.split("\\s+");
            int[] a = new int[4];
            for (int i = 0; i < 4; i++) {
                a[i] = Integer.parseInt(strs[i]);
            }
            line = in.readLine();
            strs = line.split("\\s+");
            int[] b = new int[4];
            for (int i = 0; i < 4; i++) {
                b[i] = Integer.parseInt(strs[i]);
            } 
            int hit = 0, blow = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (i != j && a[i] == b[j]) {
                        blow++;
                    } else if (i == j && a[i] == b[j]) {
                        hit++;
                    }
                }
            }
            
            System.out.println(hit + " " + blow);
        } 
    }
}
