import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int quant = sc.nextInt();

        Queue<String> qTask = new ArrayDeque<>();
        Queue<Integer> qTime = new ArrayDeque<>();
        
        for (int i = 0; i < n; i++) {
            qTask.add(sc.next());
            qTime.add(sc.nextInt());
        }
        
        int timePoint = 0;
        while (!qTask.isEmpty()) {
            String task = qTask.poll();
            int time = qTime.poll();

            if (time > quant) {
                timePoint += quant;
                qTime.add(time - quant);
                qTask.add(task);
               
            } else {
                timePoint += time;
                System.out.println(task + " " + timePoint);
            }
        }
    }
}
