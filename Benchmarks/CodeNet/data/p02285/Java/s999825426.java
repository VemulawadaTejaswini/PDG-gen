import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

class Node {
    long key;
    Node parent, left, right;

    Node(long key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return key == node.key &&
                Objects.equals(parent, node.parent) &&
                Objects.equals(left, node.left) &&
                Objects.equals(right, node.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, parent, left, right);
    }

    int getDegree() {
        int cnt = 0;
        if (left != null) cnt++;
        if (right != null) cnt++;
        return cnt;
    }
}

class BinarySearchTree {
    Node root = null;

    void insert(Node node) {
        if (root == null) {
            root = node;
        } else {
            Node parent = null;
            Node curr = root;
            while (curr != null) {
                parent = curr;
                if (node.key < parent.key)
                    curr = curr.left;
                else
                    curr = curr.right;
            }
            // Insert the node
            node.parent = parent;

            // Set the node as a child of the parent
            if (node.key < parent.key)
                parent.left = node;
            else
                parent.right = node;
        }
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

    void delete(long key) {
        find(key).ifPresent(node -> {
            Node delNode;
            if (node.getDegree() < 2) delNode = node;
            else delNode = getSuccessor(node);
            assert delNode != null;

            Node child;
            if (delNode.left != null) child = delNode.left;
            else child = delNode.right;

            if (child != null) child.parent = delNode.parent;

            if (delNode.parent == null)
                root = child;
            else if (delNode.equals(delNode.parent.left))
                delNode.parent.left = child;
            else
                delNode.parent.right = child;

            if (delNode.key != node.key)
                node.key = delNode.key;
        });
    }

    private Node getSuccessor(Node node) {
        if (node.right != null)
            return getMinimum(node.right);

        Node ret = node.parent;
        while (ret != null && node.equals(ret.right)) {
            node = ret;
            ret = ret.parent;
        }
        return ret;
    }

    private Node getMinimum(Node node) {
        Node ret = node;
        while (ret.left != null) {
            ret = ret.left;
        }
        return ret;
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
            BinarySearchTree btree = new BinarySearchTree();

            for (int i = 0; i < n; i++) {
                String[] line = in.readLine().split(" ");
                if (line[0].charAt(0) == 'i') {
                    Node node = new Node(Long.parseLong(line[1]));
                    btree.insert(node);
                } else if (line[0].charAt(0) == 'f') {
                    if (btree.find(Long.parseLong(line[1])).isPresent())
                        System.out.println("yes");
                    else
                        System.out.println("no");
                } else if (line[0].charAt(0) == 'd') {
                    btree.delete(Long.parseLong(line[1]));
                } else {
                    btree.print();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

