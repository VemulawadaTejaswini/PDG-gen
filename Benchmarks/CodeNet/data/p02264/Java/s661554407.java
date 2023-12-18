import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Process {
    String name;
    int time;

    Process(String s, int n) {
        name = s;
        time = n;
    }
}

// I want to use Generics but General type array T[] cannot define.
// add(i, elm) of List<T> shift elements to right.
// So I do not use Generics here.
class Queue {
    int size;
    Process[] buf;
    int head = 0;
    int tail = 0;

    Queue(int n) {
        size = n + 1;
        buf = new Process[size];
    }

    boolean isEmpty() {
        return head == tail;
    }

    boolean isFull() {
        return head == (tail + 1) % size;
    }

    void enqueue(Process x) {
        if (isFull()) {
            throw new IndexOutOfBoundsException("Queue is full");
        }

        buf[tail] = x;
        if ((tail + 1) == size) {
            tail = 0;
        } else {
            tail++;
        }
    }

    Process dequeue() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Queue is empty");
        }

        Process x = buf[head];
        if ((head + 1) == size) {
            head = 0;
        } else {
            head++;
        }

        return x;
    }
}

public class Main {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            String[] line = in.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int q = Integer.parseInt(line[1]);

            Queue queue = new Queue(n);
            for (int i = 0; i < n; i++) {
                line = in.readLine().split(" ");
                String name = line[0];
                int time = Integer.parseInt(line[1]);
                queue.enqueue(new Process(name, time));
            }

            int currTime = 0;
            while (true) {
                if (queue.isEmpty()) break;

                Process p = queue.dequeue();
                if (p.time <= q) {
                    currTime += p.time;
                    System.out.println(p.name + " " + currTime);
                } else {
                    currTime += q;
                    p.time -= q;
                    queue.enqueue(p);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
