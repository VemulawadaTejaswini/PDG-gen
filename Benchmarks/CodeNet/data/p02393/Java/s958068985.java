import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> N = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            N.add(Integer.parseInt(sc.next()));
        }
        Collections.sort(N);
        for (int i = 0; i < 3; i++) {
            if (i == 2) {
                System.out.printf("%d\n", N.get(i));
            } else {
                System.out.printf("%d ", N.get(i));
            }
        }
    }
}