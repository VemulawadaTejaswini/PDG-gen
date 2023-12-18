import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public int lineNumber;

    public ArrayList<Short> stack;
    public ArrayList<Short> stackStart;
    public ArrayList<Short> puddles;
    public ArrayList<Short> puddleStart;
    public int puddleNumber = 0;
    public int currentDepth = 0;
    public int prevPuddleHeight = -1;

    public int sum = 0;

    public void add(int idx, int n, boolean isConfirm) {
        if (this.stack.size() - 1 < idx) {
            this.stack.add(idx, 0);
            this.stackStart.add(idx, lineNumber);
        }
        this.stack.set(idx, (this.stack.get(idx) + n));
        if (isConfirm) {
            this.sum += this.stack.get(idx);
            this.puddles.add(puddleNumber, this.stack.get(idx));
            this.puddleStart.add(puddleNumber, this.stackStart.get(idx));
            if ((prevPuddleHeight != -1) && ((prevPuddleHeight - 1) == idx)) {
                int start = this.puddleStart.get(puddleNumber);
                for (int i = 0; i <= puddleNumber; i++) {
                    if (start < this.puddleStart.get(i)) {
                        this.puddleStart.set(i, start);
                        for (int j = i + 1; j <= puddleNumber; j++) {
                            this.puddles.set(i, this.puddles.get(i) + this.puddles.get(j));
                        }
                        for (int j = puddleNumber; j >= i + 1; j--) {
                            this.puddles.remove(j);
                            this.puddleStart.remove(j);
                        }
                        puddleNumber = i + 1;
                        break;
                    }
                }
            } else {
                puddleNumber++;
            }
            prevPuddleHeight = idx;
            this.stack.remove(idx);
            this.stackStart.remove(idx);
        }
    }

    public void up() {
        if (currentDepth == 0) {
            return;
        }
        currentDepth--;
        this.add(currentDepth, 1, true);
        for (int i = 0; i < currentDepth; i++) {
            this.add(i, 2, false);
        }
    }

    public void hori() {
        for (int i = 0; i < currentDepth; i++) {
            this.add(i, 2, false);
        }
    }

    public void down() {
        for (int i = 0; i < currentDepth; i++) {
            this.add(i, 2, false);
        }
        this.add(currentDepth, 1, false);
        currentDepth++;
    }

    public void print() {
        System.out.println(sum / 2);
        System.out.print(this.puddles.size());
        int len = this.puddles.size();
        for (int i = 0; i < len; i++) {
            System.out.print(" " + (this.puddles.get(i) / 2));
        }
        System.out.println();
    }

    public void go() {
        this.stack = new ArrayList<Integer>();
        this.stackStart = new ArrayList<Integer>();
        this.puddles = new ArrayList<Integer>();
        this.puddleStart = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        String[] strings = line.split("");
        for (int i = 0; i < strings.length; i++) {
            String s = strings[i];
            this.lineNumber = i;
            switch (s) {
            case "\\":
                this.down();
                break;
            case "_":
                this.hori();
                break;
            case "/":
                this.up();
                break;
            }
        }
        print();
    }

    public static void main(String[] args) {
        Main cui = new Main();
        cui.go();
    }
}
