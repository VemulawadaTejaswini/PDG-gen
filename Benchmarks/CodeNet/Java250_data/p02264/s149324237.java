import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main
{
    static class Process {
        private String name;
        private int time;

        public Process(String name, int time)
        {
            this.name = name;
            this.time = time;
        }

        public String getName()
        {
            return this.name;
        }
        public void setName(String name)
        {
            this.name = name;
        }
        public int getTime()
        {
            return this.time;
        }
        public void setTime(int time)
        {
            this.time = time;
        }
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Queue<Process> queue = new LinkedList<Process>();
        int n = scan.nextInt();
        int q = scan.nextInt();

        Process[] p = new Process[n];

        for (int i = 0; i < n; i++)
        {
            String name = scan.next();
            int time = scan.nextInt();
            p[i] = new Process(name, time);
            queue.offer(p[i]);
        }

        List<Process> finishProcesses = new ArrayList<Main.Process>();

        int currentTime = 0;
        while (queue.size() > 0) {
            Process current = queue.poll();
            if (current.getTime() > q) {
                current.setTime(current.getTime() - q);
                queue.offer(current);
                currentTime += q;
            }
            else {
                finishProcesses.add(new Process(current.name, currentTime + current.getTime()));
                currentTime += current.getTime();
            }
        }

        for (Process process : finishProcesses)
        {
            System.out.println(process.name + " " + process.time);
        }

        scan.close();
    }

}