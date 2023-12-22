import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        Queue queue = new Queue();
        for (int i = 0; i < n; i++) {
            queue.enqueue(new Process(scanner.next(), scanner.nextInt()));
        }
        int t = 0;
        while (queue.hasNode()) {
            Process process = queue.dequeue();
            t += Math.min(process.time, q);
            if (process.time <= q) {
                System.out.println(process.name + " " + String.valueOf(t));
            } else {
                process.time -= q;
                queue.enqueue(process);
            }
        }
    }

    private static class Process {
        private String name;
        private int time;

        private Process(String name, int time) {
            this.name = name;
            this.time = time;
        }
    }

    private static class Queue {
        private static class Node {
            private Process process;
            private Node next;
            private Node prev;

            private Node(Process process, Node next) {
                this.process = process;
                this.next = next;
            }
        }

        private Node first;
        private Node last;

        private void enqueue(Process process) {
            last = new Node(process, last);
            if (last.next != null) {
                last.next.prev = last;
            }
            if (first == null) {
                first = last;
            }
        }

        private Process dequeue() {
            Process process = first.process;
            first = first.prev;
            return process;
        }

        private boolean hasNode() {
            return first != null;
        }
    }
}