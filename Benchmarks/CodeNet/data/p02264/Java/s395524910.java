import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] l = br.readLine().split(" ");
        int n = Integer.parseInt(l[0]);
        int q = Integer.parseInt(l[1]);
        Queue<Process> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            l = br.readLine().split(" ");
            String name = l[0];
            int time = Integer.parseInt(l[1]);
            Process process = new Process(name, time);
            queue.offer(process);
        }

        int allTime = 0;

        while (queue.size() > 0) {
            Process process = queue.poll();
            int time = process.getTime();
            if (time <= q) {
                allTime += time;
                System.out.println(process.getName() + " " + allTime);
            } else {
                allTime += q;
                process.reduceTime(q);
                queue.offer(process);
            }
        }
    }
}

class Process {

    private String name;

    private int time;

    public Process(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }

    public void reduceTime(int dt) {
        time -= dt;
    }
}