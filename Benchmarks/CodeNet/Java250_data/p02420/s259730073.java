import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String[] strArray = str.split("");

        while (!str.equals("-")) {

            Queue<String> queue = new ArrayDeque<>();

            for (int i = 0; i < strArray.length; i++) {
                queue.add(strArray[i]);
            }

            int m = sc.nextInt();
            List<Integer> h = new ArrayList<>();

            for (int i = 0; i < m; i++) {
                h.add(sc.nextInt());
            }

            for (int i = 0; i < h.size(); i++) {
                for (int j = 0; j < h.get(i); j++) {
                    queue.add(queue.poll());
                }
            }

            for (int i = 0; i < strArray.length; i++) {
                System.out.print(queue.poll());
            }

            System.out.print("\n");

            str = sc.next();
            strArray = str.split("");
        }

        sc.close();
    }
}
