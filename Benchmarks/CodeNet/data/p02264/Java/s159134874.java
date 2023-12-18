import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        String[] line = new String[n];
        Queue tasks = new Queue();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            line[i] = in.nextLine();
            tasks.enqueue(new Task(line[i].split(" ")[0], Integer.parseInt(line[i].split(" ")[1])));
        }
        int costTime = 0;
        int totalTime = 0;
        while (tasks.head != tasks.tail) {
            Task current = tasks.dequeue();
            costTime = Math.min(q, current.time);
            current.time -= costTime; // 计算剩余的所需时间
            totalTime += costTime; // 累计已经过的时间
            if(current.time > 0) {
                tasks.enqueue(current);
            }
            else {
                System.out.println(current.name + " " + totalTime);
            }
        }
    }
}

class Task {
    public String name;
    public int time;

    public Task(String name, int time) {
        this.name = name;
        this.time = time;
    }
}

class Queue {
    public int head;
    public int tail;
    private Task[] queue;
    private int len = 1000001;

    public Queue() {
        this.head = this.tail = 0;
        this.queue = new Task[this.len];
    }

    public boolean isFull() {
        return (this.head == (this.tail + 1) % (this.len));
    }

    public boolean isEmpty() {
        return (this.head == this.tail);
    }

    public void enqueue(Task task) throws Exception {
        if (isFull()) {
            throw (new Exception("上溢出"));
        }
        this.queue[this.tail] = task;
        if (this.tail + 1 == this.len) {
            this.tail = 0;
        } else {
            this.tail++;
        }
    }

    public Task dequeue() throws Exception {
        if (isEmpty()) {
            throw (new Exception("下溢出"));
        }
        Task task = this.queue[this.head];
        if (this.head + 1 == this.len) {
            this.head = 0;
        } else {
            this.head++;
        }
        return task;
    }
}
