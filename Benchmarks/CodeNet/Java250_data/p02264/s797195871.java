import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
  private final static class Process {
    public String name = null;
    public int pt = 0;

    public Process(String name, int pt) {
        this.name = name;
        this.pt = pt;
    }
}
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] fr = br.readLine().split("\\s");
        int elm = Integer.parseInt(fr[0]);
        int qat = Integer.parseInt(fr[1]);
        Queue<Process> que = new LinkedList<Process>();
        for (int i = 0; i < elm; i++) {
            String[] str = br.readLine().split("\\s");
            Process process = new Process(str[0],
                    Integer.parseInt(str[1]));
            que.offer(process);
        }
        int rt = 0;
        while (que.size() > 0) {
            Process process = que.poll();
            rt += qat;
            if ((process.pt = process.pt - qat) > 0) {
                que.offer(process);
                continue; 
            }
            rt += process.pt;
            System.out.println(process.name + " " + rt);
        }

    }
    
}
