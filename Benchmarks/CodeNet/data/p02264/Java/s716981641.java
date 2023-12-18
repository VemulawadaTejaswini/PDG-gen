import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Queue<String> keys = new LinkedList<>();
        Queue<Integer> values = new LinkedList<>();
        Integer timestamp = 0;

        int ceiling = in.nextInt();
        int quantum = in.nextInt();
        while (ceiling > 0) {
            keys.add(in.next());
            values.add(in.nextInt());
            --ceiling;
        }

        while (!values.isEmpty()) {
                if (values.peek() <= quantum) {
                    timestamp += values.poll();
                    System.out.println(keys.poll() + " " + timestamp);
                } else {
                    int temp = values.poll() - quantum;
                    String tempo = keys.poll();
                    keys.add(tempo);
                    values.add(temp);
                    timestamp += quantum;
            }
        }
    }
}





