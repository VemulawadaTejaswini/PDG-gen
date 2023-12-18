import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        solve2440();
    }

    public static void solve2440() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(sc.next());
        }
        int M = sc.nextInt();
        boolean state = false;
        for (int j = 0; j < M; j++) {
            String user = sc.next();
            if (set.contains(user)) {
                state = !state;
                System.out.println(state ? "Opened by " + user : "Closed by " + user);
            } else {
                System.out.println("Unknown " + user);
            }
        }
    }

