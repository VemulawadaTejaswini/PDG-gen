import java.util.Scanner;

public class Main {

    int start;
    int end;
    int size;
    int garbageCount;
    int[] element;
    int[] next;
    int[] prev;
    int[] garbage;

    private void insert(int num) {
        if (this.start == -1) {
            if (this.garbageCount != 0) {
                this.element[this.garbage[this.garbageCount - 1]] = num;
                this.next[this.garbage[this.garbageCount - 1]] = -1;
                this.prev[this.garbage[this.garbageCount - 1]] = -1;
                this.start = this.garbage[this.garbageCount - 1];
                this.end = this.garbage[this.garbageCount - 1];
                this.garbageCount--;
            } else {
                this.element[0] = num;
                this.next[0] = -1;
                this.prev[0] = -1;
                this.start = 0;
                this.end = 0;
                this.size = 1;
            }
        } else {
            if (this.garbageCount != 0) {
                this.prev[start] = this.garbage[this.garbageCount - 1];
                this.element[this.garbage[this.garbageCount - 1]] = num;
                this.next[this.garbage[this.garbageCount - 1]] = start;
                this.prev[this.garbage[this.garbageCount - 1]] = -1;
                this.start = this.garbage[this.garbageCount - 1];
                this.garbageCount--;
            } else {
                this.prev[this.start] = this.size;
                this.element[this.size] = num;
                this.next[this.size] = this.start;
                this.prev[this.size] = -1;
                this.start = this.size;
                this.size++;
            }
        }
    }

    private void deleteFirst() {
        this.garbage[this.garbageCount] = this.start;
        this.garbageCount++;
        if (this.start == this.end) {
            this.start = -1;
            return;
        }
        this.prev[this.next[this.start]] = -1;
        this.start = this.next[this.start];
    }

    private void deleteLast() {
        this.garbage[this.garbageCount] = end;
        this.garbageCount++;
        if (this.start == this.end) {
            this.start = -1;
            return;
        }
        this.next[this.prev[this.end]] = -1;
        this.end = this.prev[this.end];
    }

    private void delete(int num) {
        int current = this.start;
        while (current != -1) {
            if (this.element[current] == num) {
                if (current == this.start) {
                    deleteFirst();
                    return;
                } else if (current == this.end) {
                    deleteLast();
                    return;
                } else {
                    this.garbage[this.garbageCount] = current;
                    garbageCount++;
                    this.next[this.prev[current]] = this.next[current];
                    this.prev[this.next[current]] = this.prev[current];
                    return;
                }
            }
            current = this.next[current];
        }
        return;
    }

    private void print() {
        int current = start;
        while (current != -1) {
            System.out.print(this.element[current]);
            current = this.next[current];
            if (current != -1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        return;
    }

    public void go() {
        Scanner sc = new Scanner(System.in);

        this.element = new int[1000000];
        this.next = new int[1000000];
        this.prev = new int[1000000];
        this.garbage = new int[1000000];

        this.start = -1;
        this.garbageCount = 0;

        int cmdCount = sc.nextInt();
        for (int i = 0; i < cmdCount; i++) {
            String cmd = sc.next();
            if (cmd.equals("insert")) {
                int num = sc.nextInt();
                insert(num);
            } else if (cmd.equals("delete")) {
                int num = sc.nextInt();
                delete(num);
            } else if (cmd.equals("deleteFirst")) {
                deleteFirst();
            } else if (cmd.equals("deleteLast")) {
                deleteLast();
            }
        }

        print();
    }

    public static void main(String[] args) {
        Main cui = new Main();
        cui.go();
    }
}
