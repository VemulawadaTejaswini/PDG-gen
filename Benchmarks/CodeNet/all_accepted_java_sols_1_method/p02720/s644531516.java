
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int k = Integer.parseInt(scan.next());

        scan.close();

        Deque<Long> queue = new ArrayDeque<Long>();

        queue.add((long)1);
        queue.add((long)2);
        queue.add((long)3);
        queue.add((long)4);
        queue.add((long)5);
        queue.add((long)6);
        queue.add((long)7);
        queue.add((long)8);
        queue.add((long)9);

        int counter = 1;
        while (counter < k) {
            long curNum = queue.poll();
            long tailCurNum = curNum % 10;

            if (tailCurNum != 0) {
                queue.add(curNum * 10 + tailCurNum - 1);
            }

            queue.add(curNum * 10 + tailCurNum);

            if (tailCurNum != 9) {
                queue.add(curNum * 10 + tailCurNum + 1);
            }

            counter++;
        }

        System.out.println(queue.poll());
    }

}
