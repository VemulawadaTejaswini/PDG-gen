import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        String[] inputs = Io.read();
        String[] meta = inputs[0].split(" ");

        int N = Integer.parseInt(meta[0]);
        int M = Integer.parseInt(meta[1]);
        int C = Integer.parseInt(meta[2]);

        int[][] sources = parse(inputs, N, M);

        int count = 0;

        for (int i = 1; i < sources.length; i++) {
            count += isCorrect(sources[0], sources[i], C) ? 1 : 0;
        }

        Io.write(count);
    }

    private static int[][] parse(String[] lines, int N, int M) {
        int[][] result = new int[N + 1][M];
        for (int i = 0; i < N + 1; i++) {
            String[] split = lines[i + 1].split(" ");
            for (int x = 0; x < M; x++) {
                result[i][x] = Integer.parseInt(split[x]);
            }
        }
        return result;
    }

    private static boolean isCorrect(int[] Bs, int[] As, int C) {
        int sum = C;
        for (int i = 0; i < Bs.length; i++) {
            sum += Bs[i] * As[i];
        }
        return sum > 0;
    }
}


class Io {

    /**
     * 標準入力から1行ずつ受け取る
     * @return
     * @throws IOException
     */
    public static String[] read() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> inputs = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            if (line.equals(""))
                break;

            inputs.add(line);
        }
        br.close();
        return inputs.toArray(new String[0]);
    }

    /**
     * 標準出力
     * @param answer
     */
    public static void write(int answer)
    {
        System.out.println(answer);
    }
}
