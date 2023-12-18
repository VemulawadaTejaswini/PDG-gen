import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int q = sc.nextInt();

    Deque<Process> procs = new ArrayDeque<>();
    for (int i = 0; i < n; i++) {
      String name = sc.next();
      int time = sc.nextInt();
      procs.push(new Process(name, time));
    }

    Deque<Process> finishedProcs = new ArrayDeque<>();

    int totalQ = 0;

    while (procs.size() > 0) {
      Process p = procs.removeLast();
      int quantum = Math.min(q, p.getTime());
      totalQ += quantum;
      p = p.progress(quantum);
      if (p.finished()) {
        finishedProcs.addLast(new Process(p.getName(), totalQ));
      } else {
        procs.addFirst(p);
      }
    }

    PrintWriter pw = new PrintWriter(System.out);
    for (Process p : finishedProcs) {
      pw.println(p.getName() + " " + p.getTime());
    }

    pw.flush();
  }

  private static class Process {
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

    public Process progress(int ms) {
      return new Process(name, time - ms);
    }

    public boolean finished() {
      return time <= 0;
    }
  }
}
