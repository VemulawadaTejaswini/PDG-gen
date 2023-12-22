import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        Set<Integer> amari = new HashSet<>();
        int f = a % b;
        while (!amari.contains(f)) {
            amari.add(f);
            f = (f + a) % b;
        }

        if (amari.contains(c)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}