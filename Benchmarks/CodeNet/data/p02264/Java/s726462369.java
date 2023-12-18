import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    static final int INF = 1000000000;     
    
    public static void main(String[] args) throws Exception {                
        Scanner input = new Scanner(System.in);
        int n, q;
        n = input.nextInt();
        q = input.nextInt(); 
        Queue<Process> queue = new ArrayDeque<Process>();
        for (int i = 0; i < n; ++i) {
            String name = input.next();
            int time = input.nextInt();
            Process element = new Process(name, time);
            queue.add(element);
        }
        ArrayList<Process> res = new ArrayList<Process>();
        int time = 0;
        while (!queue.isEmpty()) {
            Process element = queue.poll();
            if (element.getTime() <= q) {
                time += element.getTime();
                res.add(new Process(element.getName(), time));
            } else {
                time += q;
                element.setTime(element.getTime() - q);
                queue.add(element);
            }
        }
        for (Process element : res) {
            System.out.println(element.getName() + " " + element.getTime());
        }
    }                
}

class Process {
    String name;
    int time;
    public Process() {
        name = "";
        time = 0;
    }
    public Process(String name, int time) {
        this.name = name;
        this.time = time;
    }        

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}