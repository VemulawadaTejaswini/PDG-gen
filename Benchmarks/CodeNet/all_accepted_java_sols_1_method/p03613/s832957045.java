import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        int N = Integer.parseInt(reader.readLine());
        String line = reader.readLine();
        String[] inputs = line.split(" ");

        int[] as = Arrays.stream(inputs).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(as);

        int max = 1000000;
        int[] tmp = new int[max+1];


        for (int i = 0; i < N; i++) {
            tmp[as[i]] += 1;
        }

        int answer = 0;
        for (int i = 1; i < max; i++) {
            answer = Math.max(answer, tmp[i - 1] + tmp[i] + tmp[i + 1]);
        }


        System.out.println(answer);
    }
}
