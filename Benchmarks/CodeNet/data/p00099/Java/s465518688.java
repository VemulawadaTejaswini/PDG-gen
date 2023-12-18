import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int q = Integer.parseInt(input[1]);

        int[] scores = new int[n + 1]; // default 0
        HashSet<Integer> par = new HashSet<Integer>();

        for (int i = 0; i < q; i++) {
            String[] line = br.readLine().split(" ");
            scores[Integer.parseInt(line[0])] += Integer.parseInt(line[1]);
            par.add(Integer.parseInt(line[0]));

            int person = -1;
            int maxValue = Integer.MIN_VALUE;

            for (Object x : par.toArray()) {
                int j = (int) x;
                if (scores[j] > maxValue) {
                    person = j;
                    maxValue = scores[j];
                }
            }

            System.out.println(person + " " + maxValue);
        }

    }
}
