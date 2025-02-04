import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            list.add(a);
        }

        Collections.sort(list, Comparator.reverseOrder());

        int alice = 0, bob = 0;
        for (int i = 0; i < n; i++) {
            if (i%2 == 0) {
                alice += list.get(i);
            } else {
                bob += list.get(i);
            }
        }

        System.out.println(alice - bob);
    }
}