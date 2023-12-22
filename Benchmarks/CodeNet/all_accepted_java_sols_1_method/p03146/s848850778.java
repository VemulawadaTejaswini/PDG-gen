import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();

        int a[] = new int[1000001];
        Set<Integer> set = new HashSet<>();
        set.add(s);
        a[1] = s;
        for (int i = 2 ; i < 1000001 ; i++) {
            if (a[i-1] % 2 == 0) {
                a[i] = a[i - 1]/2;
                if (set.contains(a[i])) {
                    System.out.println(i);
                    return;
                } else {
                    set.add(a[i]);
                }
            } else {
                a[i] = 3 * a[i-1] + 1;
                if (set.contains(a[i])) {
                    System.out.println(i);
                    return;
                } else {
                    set.add(a[i]);
                }
            }
        }


    }

}
