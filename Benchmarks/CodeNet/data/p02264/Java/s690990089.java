import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main{

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String[] row = scan.nextLine().split(" ");

        int n = Integer.parseInt(row[0]);
        int q = Integer.parseInt(row[1]);

        Queue<Process> que = new LinkedList<Process>();
        for (int i=0; i<n; i++) {
            String[] strArray = scan.nextLine().split(" ");

            Process process = new Process(strArray[0],
					  Integer.parseInt(strArray[1]));
            que.offer(process);
        }

        int resultTime = 0;
        while (que.size() > 0) {
            Process process = que.poll();
            resultTime += q;
            if ((process.processTime = process.processTime - q) > 0) {

                que.offer(process);
                continue;
            }
            resultTime += process.processTime;

            System.out.println(process.name + " " + resultTime);
        }

    }

    private final static class Process {
        public String name = null;
        public int processTime = 0;

        public Process(String name, int processTime) {
            this.name = name;
            this.processTime = processTime;
        }
    }
}

