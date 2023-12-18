import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        Queue<Process> processes = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int time = in.nextInt();
            processes.add(new Process(name, time));
        }
        schedule(processes, q);
    }

    private static void schedule(Queue<Process> processes, int quantum) {
        int totalTime = 0;
        PriorityQueue<Process> finishedProcesses = new PriorityQueue<>();
        while (!processes.isEmpty()) {
            Process p = processes.remove();
            boolean finished = p.start(quantum);
            if (finished) {
                totalTime += quantum + p.getTime();
                p.setCompletedAt(totalTime);
                finishedProcesses.add(p);
            } else {
                totalTime += quantum;
                processes.add(p);
            }
        }
        while (!finishedProcesses.isEmpty()) {
            System.out.println(finishedProcesses.remove());
        }
    }
}

class Process implements Comparable {
    private String name;
    private int time;
    private int completedAt;

    Process(String name, int time) {
        this.name = name;
        this.time = time;
    }

    String getName() {
        return name;
    }

    int getTime() {
        return time;
    }

    void setTime(int time) {
        this.time = time;
    }

    int getCompletedAt() {
        return completedAt;
    }

    void setCompletedAt(int completedAt) {
        this.completedAt = completedAt;
    }

    /**
     * Starts the process and runs it for the amount of time given.
     * @param quantum the amount of time allotted to run the process.
     * @return True if process is finished, else false.
     */
    boolean start(int quantum) {
        int timeLeft = getTime() - quantum;
        if (timeLeft > 0) {
            setTime(timeLeft);
            return false;
        } else {
            setTime(timeLeft);
            return true;
        }
    }

    @Override
    public int compareTo(Object o) {
        Process p = (Process) o;
        return Integer.compare(getCompletedAt(), p.getCompletedAt());
    }

    @Override
    public String toString() {
        return getName() + " " + getCompletedAt();
    }
}
