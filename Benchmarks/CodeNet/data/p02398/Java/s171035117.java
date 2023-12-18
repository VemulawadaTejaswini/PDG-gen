import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String data[] = reader.readLine().split(" ");
        int a = Integer.parseInt(data[0]);
        int b = Integer.parseInt(data[1]);
        int c = Integer.parseInt(data[2]);
        int cnt = 0;

        for (int i = a; a <= b; i++) {
            if (c % i == 0) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}