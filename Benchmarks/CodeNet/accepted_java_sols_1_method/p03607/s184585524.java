import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> a = new TreeSet<Integer>();
        for (int i = 0 ; i < n ; i++) {
            int m = sc.nextInt();
            if (a.contains(m)) {
                a.remove(m);
            } else {
                a.add(m);
            }
        }
        System.out.println(a.size());
    }

}