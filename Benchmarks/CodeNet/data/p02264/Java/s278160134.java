import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

class Main {

  public static class Process {

    public String name;
    public int time;

    public Process(String name, int time) {
      this.name = name;
      this.time = time;
    }

  }

  public static void process(Queue<Process> q, int quantum) {

    int curr_time = 0;

    while (q.isEmpty() == false) {

      Process curr_ps = q.remove();

      int time_passed = Math.min(quantum, curr_ps.time);
      curr_time += time_passed;
      curr_ps.time -= time_passed;

      if (curr_ps.time == 0)
        System.out.println(curr_ps.name + " " + curr_time);
      else
        q.add(curr_ps);
    }

  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int quantum = s.nextInt();
    Queue<Process> processes = new LinkedList<Process>();
    for (int i = 0; i < n; i++) {
      processes.add(new Process(s.next(), s.nextInt()));
    }
    process(processes, quantum);
  }
}
