import java.util.*;

public class Main {
    class Node {
        int id, key, parentKey = -1, leftKey = -1, rightKey = -1;
        Node(int id, int key) {
            this.id = id;
            this.key = key;
        }
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("node ");
            sb.append(id);
            sb.append(": key = ");
            sb.append(key);
            if (parentKey != -1) {
                sb.append(", parent key = ");
                sb.append(parentKey);
            }
            if (leftKey != -1) {
                sb.append(", left key = ");
                sb.append(leftKey);
            }
            if (rightKey != -1) {
                sb.append(", right key = ");
                sb.append(rightKey);
            }
            sb.append(", ");
            return sb.toString();
        }
    }
void run() {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        Node[] A = new Node[h+1];
        for (int i = 1; i < A.length; i++) {
            int key = sc.nextInt();
            A[i] = new Node(i, key);
        }
        for (int i = 1; i < A.length; i++) {
            int parentId = i / 2;
            if (parentId != 0) A[i].parentKey = A[parentId].key;
            int leftId = 2 * i;
            int rightId = 2 * i + 1;
            if (leftId < A.length) A[i].leftKey = A[leftId].key;
            if (rightId < A.length) A[i].rightKey = A[rightId].key;
            System.out.println(A[i]);
        }
    }
    public static void main(String[] args) {
        new Main().run();
    }
}
