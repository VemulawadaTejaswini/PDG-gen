import java.util.*;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> a = new ArrayList();

        for (int i = 0; i < N; i++) {
            a.add(sc.nextInt());
        }
        sc.close();
        a.sort(Collections.reverseOrder());

        int Alice = 0;
        int Bob = 0;

        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                Alice += a.get(i);
            } else {
                Bob += a.get(i);
            }
        }

        System.out.println(Alice - Bob);
    }
}