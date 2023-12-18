import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        RootedTreeForMisawaSan solver = new RootedTreeForMisawaSan();
        solver.solve(1, in, out);
        out.close();
    }

    static class RootedTreeForMisawaSan {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String x = in.nextLine(), y = in.nextLine();
            RootedTreeForMisawaSan.Node a = parse(x), b = parse(y);
            if (a == null || b == null || !a.toString().equals(x) || !b.toString().equals(y)) {
                throw new RuntimeException("Parse failed");
            }
            a.merge(b);
            out.println(a.toString());
        }

        private static RootedTreeForMisawaSan.Node parse(String expr) {
            if (expr.equals("")) {
                return null;
            }
            assert expr.charAt(0) == '(';
            int depth = 1;
            int i = 1;
            for (; i < expr.length(); i++) {
                if (expr.charAt(i) == '(') depth++;
                else if (expr.charAt(i) == ')') depth--;
                if (depth == 0) break;
            }
            RootedTreeForMisawaSan.Node left = parse(expr.substring(1, i));
            i++;
            assert expr.charAt(i) == '[';
            i++;
            long v = 0;
            while (Character.isDigit(expr.charAt(i))) {
                v *= 10;
                v += expr.charAt(i) - '0';
                i++;
            }
            assert expr.charAt(i) == ']';
            i++;
            assert expr.charAt(i) == '(';
            i++;
            RootedTreeForMisawaSan.Node right = parse(expr.substring(i, expr.length() - 1));
            return new RootedTreeForMisawaSan.Node(v, left, right);
        }

        private static class Node {
            private long value;
            private RootedTreeForMisawaSan.Node left;
            private RootedTreeForMisawaSan.Node right;

            public Node(long value, RootedTreeForMisawaSan.Node left, RootedTreeForMisawaSan.Node right) {
                this.value = value;
                this.left = left;
                this.right = right;
            }

            public void merge(RootedTreeForMisawaSan.Node node) {
                this.value += node.value;
                if (this.left != null && node.left != null) {
                    this.left.merge(node.left);
                } else {
                    this.left = null;
                }
                if (this.right != null && node.right != null) {
                    this.right.merge(node.right);
                } else {
                    this.right = null;
                }
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append('(');
                if (left != null) {
                    sb.append(left.toString());
                }
                sb.append(")[").append(value).append("](");
                if (right != null) {
                    sb.append(right.toString());
                }
                sb.append(')');
                return sb.toString();
            }

        }

    }
}


