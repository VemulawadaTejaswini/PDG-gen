import java.math.BigInteger;
import static java.math.BigInteger.valueOf;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Tree {
    public abstract BigInteger length();
    public abstract char get(int i);

    private static char[] input;
    private static int ptr;
    private static Tree top() {
        Tree tree;
        if (input[ptr] == '(') {
            ptr++;
            tree = top();
            assert input[ptr] == ')';
            ptr++;
        } else {
            Node node = new Node();
            while (true) {
                if (Character.isDigit(input[ptr])) {
                    node.addChild(num(), top());
                } else if (Character.isUpperCase(input[ptr])) {
                    node.addChild(1, new Leaf(seq()));
                } else {
                    tree = node;
                    break;
                }
            }
        }
        return tree;
    }

    public static String seq() {
        StringBuilder seq = new StringBuilder();
        while (Character.isUpperCase(input[ptr])) {
            seq.append(input[ptr]);
            ptr++;
        }
        return seq.toString();
    }

    public static int num() {
        int number = 0;
        while (Character.isDigit(input[ptr])) {
            number = number * 10 + (input[ptr] - '0');
            ptr++;
        }
        return number;
    }

    public static Tree construct(String seq) {
        input = (seq + '\u0000').toCharArray();
        ptr = 0;
        return top();
    }
}

class Node extends Tree {
    final List<Integer> ns = new ArrayList<Integer>();
    final List<Tree> children = new ArrayList<Tree>();
    private BigInteger length = BigInteger.ZERO;
    public void addChild(int n, Tree child) {
        ns.add(n);
        children.add(child);
        length = length.add(child.length().multiply(valueOf(n)));
    }
    @Override
    public BigInteger length() {
        return length;
    }
    @Override
    public char get(int i) {
        BigInteger index = valueOf(i);
        for (int j = 0; j < ns.size(); j++) {
            if (children.get(j).length().multiply(valueOf(ns.get(j))).compareTo(index) > 0) {
                return children.get(j).get(index.mod(children.get(j).length()).intValue());
            } else {
                index = index.subtract(children.get(j).length().multiply(valueOf(ns.get(j))));
            }
        }
        return 0;
    }
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append('(');
        for (int i = 0; i < ns.size(); i++) {
            builder.append(ns.get(i));
            builder.append(children.get(i).toString());
        }
        builder.append(')');
        return builder.toString();
    }
}

class Leaf extends Tree {
    private final String seq;
    public Leaf(String seq) {
        this.seq = seq;
    }
    @Override
    public BigInteger length() {
        return valueOf(seq.length());
    }
    @Override
    public char get(int i) {
        return seq.charAt(i);
    }
    @Override
    public String toString() {
        return seq;
    }
}

class Main {
    private static void solve() {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            final String s = scanner.next();
            final int i = scanner.nextInt();
            if (s.equals("0") && i == 0) {
                break;
            }
            final Tree tree = Tree.construct(s);
            final char c = tree.get(i);
            if (c == 0) {
                System.out.println(0);
            } else {
                System.out.println(c);
            }
        }
    }

    public static void main(String... args) {
        solve();
    }
}