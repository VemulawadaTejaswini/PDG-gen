import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.LinkedList;

public class Main{

    static int n, q;

    static class Process {
        String pid;
        int task;
        int end;

        public Process(String pid, int task) {
            this.pid = pid;
            this.task = task;
        }

        public void setEnd(int end) {
            this.end = end;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] st = br.readLine().split(" ");
        n = Integer.parseInt(st[0]);
        q = Integer.parseInt(st[1]);
        LinkedList<Process> Queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            st = br.readLine().split(" ");
            String pid = st[0];
            int task = Integer.parseInt(st[1]);
            Process p = new Process(pid, task);
            Queue.add(p);
        }

        int ePosition = 0;
        Process[] endProcess = new Process[n];
        int time = 0;
        while (!Queue.isEmpty()) {
            Process p = Queue.pollFirst();
            if (p.task < q) {
                time += p.task;
                p.end = time;
                endProcess[ePosition++] = p;
            } else if (p.task > q) {
                p.task -= q;
                time += q;
                Queue.add(p);
            } else {
                time += q;
                p.end = time;
                endProcess[ePosition++] = p;
            }
        }

        for (Process p : endProcess) {
            bw.append(p.pid + " " + p.end + "\n");
        }
        bw.flush();
    }
}
