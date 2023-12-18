import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String line[] = br.readLine().split(" ");
        long sum = 0;
        int max = -1000000;
        int min = 1000000;
        int tmp;
        for (int i = 0; i < num; i++) {
            tmp = Integer.parseInt(line[i]);
            if (tmp > max) {
                max = tmp;
            }
            if (tmp < min) {
                min = tmp;
            }
            sum +=tmp;
        }
        System.out.println(min + " "+max +" "+sum);
    }
}