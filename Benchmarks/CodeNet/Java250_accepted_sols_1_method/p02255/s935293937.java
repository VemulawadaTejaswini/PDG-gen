import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] array = br.readLine().split(" ");

        for (int i = 1; i < n; i++) {
            System.out.println(String.join(" ", array));
            for (int j = i - 1; j >= 0; j--) {
                if (Integer.parseInt(array[j]) > Integer.parseInt(array[j + 1])) {
                    String tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        System.out.println(String.join(" ", array));
    }
}