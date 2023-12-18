import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    final double EPS = 1.0e-5;

    void run() {
        Scanner sc = new Scanner(System.in);
        String[] hands = new String[15];
        hands[0] = "Rock";
        hands[1] = "Fire";
        hands[2] = "Scissors";
        hands[3] = "Snake";
        hands[4] = "Human";
        hands[5] = "Tree";
        hands[6] = "Wolf";
        hands[7] = "Sponge";
        hands[8] = "Paper";
        hands[9] = "Air";
        hands[10] = "Water";
        hands[11] = "Dragon";
        hands[12] = "Devil";
        hands[13] = "Lightning";
        hands[14] = "Gun";
        Map<String, Set<String>> win = new HashMap<String, Set<String>>();
        Map<String, Set<String>> lose = new HashMap<String, Set<String>>();
        for (int i = 0; i < 15; i++) {
            Set<String> w = new HashSet<String>();
            Set<String> l = new HashSet<String>();
            for (int j = 0; j < 15; j++) {
                if (j < 8)
                    w.add(hands[(i + j) % 15]);
                else
                    l.add(hands[(i + j) % 15]);
            }
            win.put(hands[i], w);
            lose.put(hands[i], l);
        }
        while (true) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            String[] hs = new String[n];
            for (int i = 0; i < n; i++) {
                hs[i] = sc.next();
            }
            String ans = "";
            for (int i = 0; i < n; i++) {
                boolean w_flag = false;
                boolean l_flag = false;
                for (int j = 0; j < n; j++) {
                    if (i == j)
                        continue;
                    if (win.get(hs[i]).contains(hs[j])) {
                        w_flag = true;
                    } else if (lose.get(hs[i]).contains(hs[j])) {
                        l_flag = true;
                    }
                }
                if (w_flag && !l_flag) {
                    ans = hs[i];
                    break;
                }
            }
            System.out.println(ans == "" ? "Draw" : ans);
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}