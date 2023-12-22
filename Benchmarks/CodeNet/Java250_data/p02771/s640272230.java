import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> s = new HashSet<>();
        s.add(sc.nextInt());
        s.add(sc.nextInt());
        s.add(sc.nextInt());

        System.out.println(s.size() == 2 ? "Yes" : "No");
    }
}
