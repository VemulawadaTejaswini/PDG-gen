import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        final String SPACE = " ";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputData[] = br.readLine().split(SPACE);
        final int a = Integer.parseInt(inputData[0]);
        final int b = Integer.parseInt(inputData[1]);
        final int c = Integer.parseInt(inputData[2]);
        int cnt = 0;

        for (int i = 0; a + i <= b; i++) {
            if (c % (a + i) == 0) {
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}