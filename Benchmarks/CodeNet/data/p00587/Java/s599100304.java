import java.util.Scanner;

class Main {
    static class Tree {
        private final Tree lhs;
        private final Tree rhs;

        public Tree(Tree lhs, Tree rhs) {
            this.lhs = lhs;
            this.rhs = rhs;
        }

        private static char[] expr;
        private static int ptr;
        private static Tree constructRec() {
            if (expr[ptr] == '(') {
                ptr++;
                Tree lhs = constructRec();
                assert expr[ptr] == ',';
                ptr++;
                Tree rhs = constructRec();
                assert expr[ptr] == ')';
                ptr++;
                return new Tree(lhs, rhs);
            } else {
                return null;
            }
        }

        public static Tree construct(char[] expr) {
            Tree.expr = expr;
            Tree.ptr = 0;
            return constructRec();
        }

        public static Tree intersectionOf(Tree t1, Tree t2) {
            if (t1 == null || t2 == null) {
                return null;
            } else {
                return new Tree(intersectionOf(t1.lhs, t2.lhs), 
                                intersectionOf(t1.rhs, t2.rhs));
            }
        }

        public static Tree unionOf(Tree t1, Tree t2) {
            if (t1 == null && t2 == null) {
                return null;
            } else if (t1 == null) {
                return new Tree(unionOf(t1, t2.lhs), unionOf(t1, t2.rhs));
            } else if (t2 == null) {
                return new Tree(unionOf(t1.lhs, t2), unionOf(t1.rhs, t2));
            } else {
                return new Tree(unionOf(t1.lhs, t2.lhs), unionOf(t1.rhs, t2.rhs));
            }
        }

        private static void showRec(Tree t) {
            System.out.print('(');
            if (t.lhs != null) {
                showRec(t.lhs);
            }
            System.out.print(',');
            if (t.rhs != null) {
                showRec(t.rhs);
            }
            System.out.print(')');
        }

        public static void show(Tree t) {
            showRec(t);
            System.out.println();
        }
    }

    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            char operation = scanner.next().charAt(0);
            Tree t1 = Tree.construct(scanner.next().toCharArray());
            Tree t2 = Tree.construct(scanner.next().toCharArray());
            Tree t3;
            if (operation == 'i') {
                t3 = Tree.intersectionOf(t1, t2);
            } else {
                t3 = Tree.unionOf(t1, t2);
            }
            Tree.show(t3);
        }
    }

    public static void main(String... args) {
        solve();
    }
}