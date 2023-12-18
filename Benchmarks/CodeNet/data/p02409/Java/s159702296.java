import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        int[][][] num = new int[4][3][10];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.lines().forEach(s -> {
            List<Integer> list = Arrays.stream(s.split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

            num[list.get(0) - 1][list.get(1) - 1][list.get(2) - 1] += list.get(3);
        });

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.println(num[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println("####################");
        }
    }
}