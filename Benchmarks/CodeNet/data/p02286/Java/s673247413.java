import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

class Node {
    long key, priority;
    Node left, right;

    Node(long key, long priority) {
        this.key = key;
        this.priority = priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return key == node.key &&
                priority == node.priority &&
                Objects.equals(left, node.left) &&
                Objects.equals(right, node.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, priority, left, right);
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                ", priority=" + priority +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}

class Treap {
    Node root = null;

    Node rightRotate(Node t) {
        Node s = t.left;
        t.left = s.right;
        s.right = t;
        return s;
    }

    Node leftRotate(Node t) {
        Node s = t.right;
        t.right = s.left;
        s.left = t;
        return s;
    }

    private Node insert(Node t, Node node) {
        if (t == null) return node;
        if (node.key == t.key) return t;

        if (node.key < t.key) {
            t.left = insert(t.left, node);
            if (t.priority < t.left.priority)
                t = rightRotate(t);
        } else {
            t.right = insert(t.right, node);
            if (t.priority < t.right.priority)
                t = leftRotate(t);
        }

        return t;
    }

    void insert(Node node) {
        root = insert(root, node);
    }

    Optional<Node> find(long key) {
        Node curr = root;
        while (curr != null && curr.key != key) {
            if (key < curr.key)
                curr = curr.left;
            else
                curr = curr.right;
        }
        return Optional.ofNullable(curr);
    }

    private Node _delete(Node t, long key) {
        if (t.left == null && t.right == null) {
            return null;
        } else if (t.left == null)
            t = leftRotate(t);
        else if (t.right == null)
            t = rightRotate(t);
        else {
            if (t.left.priority > t.right.priority)
                t = rightRotate(t);
            else
                t = leftRotate(t);
        }
        return delete(t, key);
    }

    private Node delete(Node t, long key) {
        if (t == null)
            return null;
        if (key < t.key)
            t.left = delete(t.left, key);
        else if (key > t.key)
            t.right = delete(t.right, key);
        else
            return _delete(t, key);

        return t;
    }

    void delete(long key) {
        root = delete(root, key);
    }

    private void inorderTreeWalk(List<Long> ret, Node curr) {
        if (curr == null) return;
        inorderTreeWalk(ret, curr.left);
        ret.add(curr.key);
        inorderTreeWalk(ret, curr.right);
    }

    private void preorderTreeWalk(List<Long> ret, Node curr) {
        if (curr == null) return;
        ret.add(curr.key);
        preorderTreeWalk(ret, curr.left);
        preorderTreeWalk(ret, curr.right);
    }

    void print() {
        List<Long> arr = new ArrayList<>();
        inorderTreeWalk(arr, root);
        System.out.println(" " + arr.stream().map(String::valueOf).collect(Collectors.joining(" ")));

        arr.clear();
        preorderTreeWalk(arr, root);
        System.out.println(" " + arr.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}

public class Main {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            final int n = Integer.parseInt(in.readLine());
            Treap treap = new Treap();

            for (int i = 0; i < n; i++) {
                String[] line = in.readLine().split(" ");
                if (line[0].charAt(0) == 'i') {
                    Node node = new Node(Long.parseLong(line[1]), Long.parseLong(line[2]));
                    treap.insert(node);
                } else if (line[0].charAt(0) == 'f') {
                    if (treap.find(Long.parseLong(line[1])).isPresent())
                        System.out.println("yes");
                    else
                        System.out.println("no");
                } else if (line[0].charAt(0) == 'd') {
                    treap.delete(Long.parseLong(line[1]));
                } else {
                    treap.print();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

