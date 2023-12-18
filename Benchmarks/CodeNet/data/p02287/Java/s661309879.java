import java.util.*;

public class Main {
    class Node {
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
            if (parentId != 0) A[i].setParent(A[parentId].key);
            int leftId = 2 * i;
            int rightId = 2 * i + 1;
            if (leftId < A.length) A[i].setLeft(A[leftId].key);
            if (rightId < A.length) A[i].setRight(A[rightId].key);
        }
        for (int i = 1; i < A.length; i++)
            System.out.println(A[i]);
    }
    public static void main(String[] args) {
        new Main().run();
    }
}
