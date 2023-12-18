import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int quant = sc.nextInt();

        Queue<TimeTask> que = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            que.add(new TimeTask(sc.next(), sc.nextInt()));
        }
        
        int timePoint = 0;
        while (!que.isEmpty()) {
            TimeTask head = que.poll();

            if (head.time > quant) {
                timePoint += quant;
                head.addTime(-quant);
                que.add(head);
                
            } else {
                timePoint += head.time;
                System.out.println(head.task + " " + timePoint);
            }
        }
    }
    
    static class TimeTask {
        String task;
        int time;
        TimeTask (String task, int time) {
            this.task = task;
            this.time = time;
        }
        
        void addTime(int add) {
            time += add;
        }
    }
}
