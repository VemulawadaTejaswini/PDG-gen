import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        HashSet<Long> a = new HashSet<>();
        for (int i = 0; i < N; i++) {
            long t = scan.nextLong();
            if (!a.contains(t)) {
                a.add(t);
            } else {
                a.remove(t);
            }
        }
        System.out.println(a.size());
    }
}
