import java.util.*;

class Task {
    String name;
    int time;
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int quantum = sc.nextInt();

        Queue<Task> que = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            Task task = new Task();
            task.name = sc.next();
            task.time = sc.nextInt();
            que.offer(task);
        }

        int time = 0;

        while(que.peek() != null) {
            Task task = que.poll();
            if (task.time > quantum) {
                time += quantum;
                task.time -= quantum;
                que.offer(task);
            } else {
                time += task.time;
                String output = String.format("%s %d", task.name, time);
                System.out.println(output);
            }
        }
        
        sc.close();
    }
}

