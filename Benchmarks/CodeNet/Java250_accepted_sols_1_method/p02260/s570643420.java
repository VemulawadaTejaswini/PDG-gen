import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] array = br.readLine().split(" ");
        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            int min0 = Integer.parseInt(array[i]);
            int min1 = Integer.MAX_VALUE;
            int indexOfMin1 = 0;
            for (int j = i + 1; j < n; j++) {
                int aj = Integer.parseInt(array[j]);
                if (aj < min1) {
                    min1 = aj;
                    indexOfMin1 = j;
                }
            }
            if (min1 < min0) {
                String tmp = array[i];
                array[i] = array[indexOfMin1];
                array[indexOfMin1] = tmp;
                count++;
            }
        }

        System.out.println(String.join(" ", array));
        System.out.println(count);
    }
}