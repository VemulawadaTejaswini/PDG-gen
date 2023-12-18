
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(sc.next());
        int move = sc.nextInt();
        int length = sb.length();

        for (int i = 0; i < length; i++) {
            if (sb.charAt(i) == 'a') continue;
            int diff = 26 - (sb.charAt(i) - 'a');
            if (diff <= move) {
                sb.setCharAt(i, 'a');
                move -= diff;
            }
            if (move == 0) break;
        }

        move %= 26;
        if (move != 0)
            sb.setCharAt(length - 1, (char) (sb.charAt(length - 1) + move));

        System.out.println(sb);
    }
}