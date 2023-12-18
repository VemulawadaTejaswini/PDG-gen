import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static final List<Integer> CARDS;
    static {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        CARDS = Collections.unmodifiableList(list);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        int myFirstCard, mySecondCard, rivalCard;

        while ((line = br.readLine()) != null && ! line.isEmpty()) {
            StringTokenizer st = new StringTokenizer(line);
            myFirstCard = Integer.parseInt(st.nextToken());
            mySecondCard = Integer.parseInt(st.nextToken());
            rivalCard = Integer.parseInt(st.nextToken());

            int sum = myFirstCard + mySecondCard;
            if (sum <= 10) {
                System.out.println("YES");
                continue;
            }

            int maxCard = 20 - sum;
            int goodCardCount = 0;
            for (Integer num : CARDS) {
                if (num == myFirstCard || num == mySecondCard || num == rivalCard) {
                    continue;
                }
                if (num <= maxCard) {
                    goodCardCount++;
                }
            }

            System.out.println((goodCardCount > 3) ? "YES" : "NO");
        }
    }
}