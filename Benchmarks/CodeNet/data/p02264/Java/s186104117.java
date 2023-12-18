import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Queue<String> name = new LinkedList<>();
        Queue<Integer> time = new LinkedList<>();
        int a = in.nextInt();
        int b = in.nextInt();
        int timer = 0;

        for (int i = 0; i < a; i++) {
            name.add(in.next());
            time.add(in.nextInt());
        }
        while (name.size() != 0) {
            if (time.peek() - b > 0) {
                name.add(name.poll());
                time.add(time.poll() - b);
                timer += b;
            } else {
                timer += time.poll();
                System.out.println(name.poll() + " " + timer);
            }
        }
    }
}

