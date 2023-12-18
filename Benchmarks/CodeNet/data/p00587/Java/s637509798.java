import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while ((line = br.readLine()) != null) {
            String[] items = line.split(" ");
            Calculator calc = parseCalculator(items[0]);
            Node arg1 = parseNode(items[1]);
            Node arg2 = parseNode(items[2]);

            Node result = calc.calc(arg1, arg2);

            System.out.println(arg1);
            System.out.println(arg2);
            System.out.println(result);
        }
    }

    static private Calculator parseCalculator(String calculator) {
        Calculator ret;
        switch (calculator) {
            case "u":
                ret = new Union();
                break;
            case "i":
                ret = new Intersect();
                break;
            default:
                throw new IllegalArgumentException("?????????????????????");
        }
        return ret;
    }

    static private Node parseNode(String node) {
        if (node.isEmpty())
            return null;

        return new Node(node);
    }

    static private class Node {
        private Node left;
        private Node right;

        private interface Direction {
            boolean inRange(String str, int index);
            char startSymbol();
            char endSymbol();
            int nextIndex(int index);
        }
        private class Forward implements Direction {
            @Override
            public boolean inRange(String str, int index) {
                return (index < str.length());
            }

            @Override
            public char startSymbol() {
                return '(';
            }

            @Override
            public char endSymbol() {
                return ')';
            }

            @Override
            public int nextIndex(int index) {
                return index + 1;
            }
        }
        private class Backward implements Direction {
            @Override
            public boolean inRange(String str, int index) {
                return (0 < index);
            }

            @Override
            public char startSymbol() {
                return ')';
            }

            @Override
            public char endSymbol() {
                return '(';
            }

            @Override
            public int nextIndex(int index) {
                return index - 1;
            }
        }

        public int findCorrespondingSymbol(String str, int startIndex, Direction dir) {
            int numOfStartSymbols = 0;
            for (int i = startIndex; dir.inRange(str, i); i = dir.nextIndex(i)) {
                char ch = str.charAt(i);
                if (ch == dir.endSymbol()) {
                    // else -> pop
                    numOfStartSymbols--;
                    // stack is empty? -> break loop;
                    if (numOfStartSymbols == 0)
                        return i;
                } else if (ch == dir.startSymbol()) {
                    // push
                    numOfStartSymbols++;
                }
            }
            return -1;
        }

        public Node(Node left, Node right) {
            this.left = left;
            this.right = right;
        }
        public Node(String expression) {
            // parse expression
            if (expression.equals("(,)")) {
                left = null;
                right = null;
            } else {
                if (expression.charAt(1) == '(') {
                    // ????????????')'?????§??????????????????Node???????????????left????¨????
                    int lastIndex = findCorrespondingSymbol(expression, 1, new Forward());
                    String leftStr = expression.substring(1, lastIndex + 1);
                    left = new Node(leftStr);
                } else {
                    left = null;
                }

                if (expression.charAt(expression.length() - 2) == ')') {
                    // ????????????'('?????§??????????????????Node???????????????right????¨????
                    int firstIndex = findCorrespondingSymbol(expression, expression.length() - 2,
                            new Backward());
                    String rightStr = expression.substring(firstIndex, expression.length() - 2 + 1);
                    right = new Node(rightStr);
                } else {
                    right = null;
                }
            }
        }

        @Override
        public String toString() {
            String leftStr = (left == null)? "" : left.toString();
            String rightStr = (right == null)? "" : right.toString();
            return "(" + leftStr + "," + rightStr + ")";
        }
    }

    private interface Calculator {
        Node calc(Node arg1, Node arg2);
    }

    static private class Intersect implements Calculator {
        @Override
        public Node calc(Node arg1, Node arg2) {
            if (arg1 == null || arg2 == null) {
                return null;
            } else {
                return new Node(calc(arg1.left, arg2.left), calc(arg1.right, arg2.right));
            }
        }
    }

    static private class Union implements Calculator {
        @Override
        public Node calc(Node arg1, Node arg2) {
            if (arg1 == null && arg2 == null) {
                return null;
            } else if (arg1 != null && arg2 == null) {
                return arg1;
            } else if (arg1 == null && arg2 != null) {
                return arg2;
            } else {
                return new Node(calc(arg1.left, arg2.left), calc(arg1.right, arg2.right));
            }
        }
    }
}