import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i = in.nextInt(), pocitadlo = 0;
        String answer = "No";

        String s = Integer.toString(i);

        for (int x = 0; x < s.length(); x++) {
            char c = s.charAt(x);

            for (int y = 0; y < s.length(); y++) {
                if(pocitadlo >= 3) break;
                else if ((s.charAt(y) == c) && (pocitadlo <= 2)) pocitadlo++;
                else pocitadlo = 0;
            }

            if (pocitadlo >= 3) {
                answer = "Yes";
                break;
            }

            pocitadlo = 0;
        }

        System.out.print(answer);
    }
}
