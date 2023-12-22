import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt(), ms = sc.nextInt();
        String[] name = new String[c];
        int[] time = new int[c];
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < c; i++) {
            name[i] = sc.next();
            time[i] = sc.nextInt();
            queue.add(i);
        }
        int total = 0;
        while (!queue.isEmpty()) {
            int i = queue.remove();
            if (time[i] > ms) {
                time[i] -= ms;
                total += ms;
                queue.add(i);
            } else {
                total += time[i];
                System.out.println(name[i] + " " + total);
            }
        }
    }
}