import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        try {
            int N = Integer.parseInt(stdin.readLine());
            int[] honest = new int[N];
            int[] unkind = new int[N];
            for (int i = 0; i < N; i++) {
                int A = Integer.parseInt(stdin.readLine());
                for (int j = 0; j < A; j++) {
                    String[] input = stdin.readLine().split(" ");
                    if (Integer.parseInt(input[1]) == 1) {
                        honest[i] |= (1 << (Integer.parseInt(input[0]) - 1));
                    } else {
                        unkind[i] |= (1 << (Integer.parseInt(input[0]) - 1));
                    }
                }
            }
            int max = 0;
            for (int i = 1; i < (1 << N); i++) {
                int honest_sum = 0;
                int unkind_sum = 0;
                int num = 0;
                // System.out.println(String.format("%" + N + "s",
                // Integer.toBinaryString(i)).replace(' ', '0'));
                for (int j = 0; j < N; j++) {

                    if ((i & (1 << j)) != 0) {
                        num++;
                        if (honest[j] != 0)
                            honest_sum |= honest[j];
                        if (unkind[j] != 0)
                            unkind_sum |= unkind[j];
                    }
                }
                // System.out.println("honest_sum:"
                // + String.format("%" + N + "s", Integer.toBinaryString(honest_sum)).replace('
                // ', '0'));
                // System.out.println("unkind_sum:"
                // + String.format("%" + N + "s", Integer.toBinaryString(unkind_sum)).replace('
                // ', '0'));
                if (((honest_sum & unkind_sum) == 0) & ((i & unkind_sum) == 0) & ((~i & honest_sum) == 0)) {
                    // System.out.println("[honest_sum & unkind_sum]:" + (honest_sum & unkind_sum) +
                    // " [i & unkind_sum]:"
                    // + (i & unkind_sum));
                    max = Math.max(max, num);
                }
            }

            System.out.println(max);

            // int N = Integer.parseInt(stdin.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }
}