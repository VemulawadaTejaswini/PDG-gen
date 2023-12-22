import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        String s;
        try (Scanner cin = new Scanner(System.in)) {
            n = cin.nextInt();
            s = cin.next();
        }

        long changer = s.subSequence(1, n).chars()
                .filter(c -> c == 'E')
                .count();
        long minChanger = changer;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i - 1) == 'W') changer++;
            if (s.charAt(i) == 'E') changer--;
            minChanger = Math.min(changer, minChanger);
        }

        System.out.println(minChanger);
    }

}
