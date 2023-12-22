import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        int a = s;
        int index = 1;
        while (!set.contains(a)) {
            set.add(a);
            if (a % 2 == 0) {
                a /= 2;
            } else {
                a = 3 * a + 1;
            }
            index++;
        }
        System.out.println(index);
        sc.close();
    }
}