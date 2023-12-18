
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static class Proc {
        public String name;
        public int time;

        public Proc(String name, int time) {
            this.name = name;
            this.time = time;
        }

        public int run(int quantum) {
            if (time > quantum) {
                time -= quantum;
                return quantum;
            } else {
                quantum = time;
                time = 0;
                return quantum;
            }
        }

        public boolean isFinished() {
            return time == 0;
        }
    }

    static class Queue {
        Proc[] elements;
        int head = 0;
        int tail = 0;
        int count = 0;
        
        public Queue(int max) {
            elements = new Proc[max];
            head = 0;
            tail = 0;
            count = 0;
        }

        public boolean enqueue(Proc t) {
            if (isFull()) {
                return false;
            }
            elements[head++] = t;
            count++;
            if (head >= elements.length) {
                head = 0;
            }
            return true;
        }
        
        public Proc dequeue() {
            Proc elem = null;
            if (!isEmpty()) {
                elem = elements[tail++];
                count--;
                if (tail >= elements.length) {
                    tail = 0;
                }
            }

            return elem;
        }

        public boolean isEmpty() {
            return count == 0;
        }
        
        public boolean isFull() {
            return count == elements.length;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String[] nAndq = r.readLine().split(" ");
        int n = Integer.parseInt(nAndq[0]);
        int q = Integer.parseInt(nAndq[1]);
        Queue queue = new Queue(n);
        
        for (int i = 0;i < n;i++) {
            String[] elems = r.readLine().split(" ");
            if (!queue.enqueue(new Proc(elems[0], Integer.parseInt(elems[1])))) {
                System.err.println("Failed enqueue.");
            }
        }

        int clock = 0;
        while (!queue.isEmpty()) {
            Proc p = queue.dequeue();
            clock += p.run(q);
            if (p.isFinished()) {
                System.out.println(p.name + " " + clock);
                if (queue.isEmpty()) {
                    break;
                }
            } else {
                queue.enqueue(p);
            }
        }
    }
}