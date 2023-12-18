import java.util.*;

public class Main {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);

                int n = Integer.parseInt(s.next());
                int[] cards = new int[n];

                for (int i=0; i<n; i++) {
                        cards[i] = Integer.parseInt(s.next());
                }

                Arrays.sort(cards);

                int[] total = {0, 0};
                for (int i=n-1; i>=0; i--) {
                        int idx = n-1-i;
                        total[idx%2] += cards[i];
                }

                System.out.println(total[0]-total[1]);
        }
}
