import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();

        Map<Integer, Integer> m = new HashMap<Integer, Integer>();

        int i = 1;
        int a = s;
        m.put(a, i);

        // start from i == 2
        i++;
        while (true) {
            if (a % 2 == 0) {
                a = a / 2;
            } else {
                a = 3 * a + 1;
            }
            //System.out.println(String.format("%d %d", i, a));
            if (m.containsKey(a)) {
                System.out.println(i);
                return;
            }

            m.put(a, i);
            i++;
        }

    }

}