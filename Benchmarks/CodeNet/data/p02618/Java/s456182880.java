import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner s = new Scanner(System.in)) {
            int d = s.nextInt();
            s.nextLine();
            int[] c = Arrays.stream(s.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
            int[] count = new int[26];
            int sum = Arrays.stream(c).sum();
            int negate = 0;
            int fill = 0;
            for (int i = 0; i < d; i++) {
                int[] sd = Arrays.stream(s.nextLine().split(" "))
                            .mapToInt(Integer::parseInt)
                            .toArray();
                negate += sum;
                int index = 0;
                int subsum = Integer.MIN_VALUE;
                for (int j = 0; j < 26; j++) {
                    count[j]++;
                    int temp = sd[j] + c[j] * count[j];
                    if (temp > subsum) {
                        index = j;
                        subsum = temp;
                    }
                }
                fill += subsum;
                count[index] = 0;
                System.out.println(index + 1);
            }
        }
    }
}
