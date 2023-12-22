import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ss = { "Sunny", "Cloudy", "Rainy" };
        String s = sc.next();
        for (int i = 0; i < ss.length; i++) {
            if (ss[i].equals(s)) {
                System.out.println(ss[(i + 1) % 3]);
            }
        }
    }
}