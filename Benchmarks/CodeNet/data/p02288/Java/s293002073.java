import java.util.*;



public class Main {
    static class Node {
        int id, key, parentKey, leftKey, rightKey;
        boolean parentIsValid = false;
        boolean leftIsValid = false;
        boolean rightIsValid = false;
        Node(int id, int key) {
            this.id = id;
            this.key = key;
        }
        void setParent(int k) {
            this.parentKey = k;
            this.parentIsValid = true;
        }
        void setLeft(int k) {
            this.leftKey = k;
            this.leftIsValid = true;
        }
        void setRight(int k) {
            this.rightKey = k;
            this.rightIsValid = true;
        }
public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("node ");
            sb.append(id);
            sb.append(": key = ");
            sb.append(key);
            if (parentIsValid) {
                sb.append(", parent key = ");
                sb.append(parentKey);
            }
            if (leftIsValid) {
                sb.append(", left key = ");
                sb.append(leftKey);
            }
            if (rightIsValid) {
                sb.append(", right key = ");
                sb.append(rightKey);
            }
            sb.append(", ");
            return sb.toString();
        }
        static void exchangeKey(Node a, Node b) {
            int tmp = a.key;
            a.key = b.key;
            b.key = tmp;
        }
    }
Node[] A;
    int H; // heap size
    void maxHeapify(int i) {
        int l = left(i);
        int r = right(i);
        int largest = 0;
        if (l <= H && A[l].key > A[i].key) {
            largest = l;
        } else {
            largest = i;
        }
        if (r <= H && A[r].key > A[largest].key) {
            largest = r;
        }
        if (largest != i) {
            Node.exchangeKey(A[i], A[largest]);
            maxHeapify(largest);
        }
    }
    int parent(int x) {
        return x/2;
    }
    int left(int x) {
        return 2*x;
    }
    int right(int x) {
        return 2*x+1;
    }
    void buildMaxHeap() {
        for (int i = H/2; i >= 1; i--) {
            maxHeapify(i);
        }
    }
    void printHeapKeys() {
        /*
        if (A.length >= 2) System.out.print(A[1].key);
        for (int i = 2; i < A.length; i++) {
            System.out.print(" "+A[i].key);
        }*/
        for (int i = 1; i < A.length; i++) System.out.print(" "+A[i].key);
        System.out.println();
    }
void run() {
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        A = new Node[H+1];
        for (int i = 1; i < A.length; i++) {
            int key = sc.nextInt();
            A[i] = new Node(i, key);
        }
        for (int i = 1; i < A.length; i++) {
            int parentId = parent(i);
            if (parentId != 0) A[i].setParent(A[parentId].key);
            int leftId = left(i);
            int rightId = right(i);
            if (leftId < A.length) A[i].setLeft(A[leftId].key);
            if (rightId < A.length) A[i].setRight(A[rightId].key);
        }
        buildMaxHeap();
        printHeapKeys();

    }
    public static void main(String[] args) {
        new Main().run();
    }
}
