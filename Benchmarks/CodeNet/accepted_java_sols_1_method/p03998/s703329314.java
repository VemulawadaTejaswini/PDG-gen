import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] s = new String[3];

        for (int i = 0; i < 3; i++) {
            s[i] = scan.next();
        }

        int[] idx = new int[3];
        int nextTurn = 0;
        while (idx[nextTurn] < s[nextTurn].length()) {
            char nextCard = s[nextTurn].charAt(idx[nextTurn]);
            idx[nextTurn]++;
            nextTurn = nextCard - 'a';
        }

        char winner = 'A';
        winner += nextTurn;
        System.out.println(Character.toUpperCase(winner));
    }
}
