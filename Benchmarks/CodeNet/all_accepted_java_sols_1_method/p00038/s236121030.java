import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String S = sc.next();

            int[] card = new int[5];
            for (int i = 0; i < 5; i++) {
                card[i] = Integer.parseInt(S.split(",")[i]);
            }

            Arrays.sort(card);

            String ans;
            if (card[1] == card[4] || card[0] == card[3]) {
                ans = "four card";
            } else if ((card[0] == card[2] && card[3] == card[4]) || (card[0] == card[1] && card[2] == card[4])) {
                ans = "full house";
            } else if ((card[0] == card[2]) || (card[1] == card[3]) || (card[2] == card[4])) {
                ans = "three card";
            } else if ((card[0] == card[1] && card[2] == card[3]) || (card[0] == card[1] && card[3] == card[4]) || (card[1] == card[2] && card[3] == card[4])) {
                ans = "two pair";
            } else if ((card[0] == card[1]) || (card[1] == card[2]) || (card[2] == card[3]) || (card[3] == card[4])) {
                ans = "one pair";
            } else if ((card[0] + 4 == card[1] + 3 && card[1] + 3 == card[2] + 2 && card[2] + 2 == card[3] + 1 && card[3] + 1 == card[4]) || (card[0] == 1 && card[1] == 10 && card[2] == 11 && card[3] == 12 && card[4] == 13)) {
                ans = "straight";
            } else {
                ans = "null";
            }

            System.out.println(ans);
        }
    }
}