import java.util.*;

public class Main {

    static StringBuilder builder = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String stones = sc.next();

//        int n = 200000;
//
//        StringBuilder builder = new StringBuilder();
//        for (int i = 0; i < n; i++) {
//            builder.append(Math.random() > 0.5 ? 'W' : 'R');
//        }
//        String stones = builder.toString();

        int current;
        int wIndex;
        long steps = 0;
        while ((wIndex = stones.indexOf("W")) < (current = stones.lastIndexOf("R"))
                && stones.contains("W")
                && stones.contains("R")
        ) {
//            if (stones.contains("W")) {
            stones = replace(wIndex, current, stones);
//            } else {
//                stones = changeToW(current, stones);
//            }
            steps++;
        }
        System.out.println(steps);
    }

    private static String replace(int wIndex, int rIndex, String stones) {
        builder.setLength(0);
        builder.append(stones);
        builder.setCharAt(wIndex, 'R');
        builder.setLength(rIndex);
        return builder.toString();
    }

//    private static String changeToW(int index, String stones) {
//        return stones.substring(0, index);
//    }
}
