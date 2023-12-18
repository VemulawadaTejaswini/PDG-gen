import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String stones = sc.next();

        int current = n - 1;
        long steps = 0;
        while (stones.indexOf("W") < stones.lastIndexOf("R")
                && stones.contains("W")
                && stones.contains("R")
        ) {
            if (stones.charAt(current) == 'R') {
                if (stones.contains("W")) {
                    stones = replace(stones.indexOf("W"), current, stones);
                } else {
                    stones = changeToW(current, stones);
                }
                steps++;
            }
            current--;
        }
        System.out.println(steps);
    }

    private static String replace(int wIndex, int rIndex, String stones) {
        StringBuilder builder = new StringBuilder(stones);
        builder.setCharAt(wIndex, 'R');
        builder.setCharAt(rIndex, 'W');
        return builder.toString();
    }

    private static String changeToW(int index, String stones) {
        StringBuilder builder = new StringBuilder(stones);
        builder.setCharAt(index, 'W');
        return builder.toString();
    }
}
