import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);
        int x = Integer.parseInt(line[2]);
        String[] str_a = br.readLine().split(" ");
        int[] a = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = Integer.parseInt(str_a[i]);
        }
        
        
        int after = 0;
        int before = 0;
        for (int aa : a) {
            if (aa > x) after++;
            else before++;
        }
        System.out.println(Math.min(after, before));
    }
}
