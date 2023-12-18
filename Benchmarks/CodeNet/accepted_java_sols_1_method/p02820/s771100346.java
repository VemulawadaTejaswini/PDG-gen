import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int n = sc.nextInt();
        final int k = sc.nextInt();
        final int r = sc.nextInt();
        final int s = sc.nextInt();
        final int p = sc.nextInt();
        final String t = sc.next();

        final char[] hands = {'r', 's', 'p'};

        final Map<Character, Character> bestChoiceMap = new HashMap<>();
        bestChoiceMap.put('r', 'p');
        bestChoiceMap.put('s', 'r');
        bestChoiceMap.put('p', 's');

        long ans = 0;
        final char[] actual = new char[n];
        for (int i = 0; i < n; i++) {
            final char prevHand = i - k >= 0 ? actual[i-k] : 0;
            final char c = t.charAt(i);
            final char nextC = i + k < n ? t.charAt(i+k) : 0;

            actual[i] = bestChoiceMap.get(c);

//            System.out.println(c + ":" + actual[i]);
            if (actual[i] == prevHand) {
                for (char hand : hands) {
                    if ((nextC == 0 || hand != bestChoiceMap.get(nextC)) && hand != prevHand) {
                        actual[i] = hand;
                    }
                }
            }

            if (actual[i] == 'r' && c == 's') ans += r;
            if (actual[i] == 's' && c == 'p') ans += s;
            if (actual[i] == 'p' && c == 'r') ans += p;
//            System.out.println(c + ":" + actual[i]);
        }

        System.out.println(ans);
    }
}
