import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> l = new ArrayList<>();
        l.add(sc.nextInt());
        l.add(sc.nextInt());
        l.add(sc.nextInt());
        Collections.sort(l);
        System.out.print(l.get(0) + l.get(1));
    }
}
