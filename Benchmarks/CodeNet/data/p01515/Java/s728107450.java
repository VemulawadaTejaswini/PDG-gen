import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String token = in.next();
        while (!"#".equals(token)) {
            String[] tokens = token.replace("->", ">").split("=");
            AST left = AST.parse(tokens[0]), right = AST.parse(tokens[1]);
            boolean eq = true;
            for (int i = 0; i < (1 << 11); i++) {
                if (left.eval(i) != right.eval(i)) {
                    eq = false;
                }
            }
            out.println(eq ? "YES" : "NO");

            token = in.next();
        }

        out.flush();
    }

    static abstract class AST {
        abstract boolean eval(int var);

        static AST parse(String token) {
            int start = 0;
            while (token.charAt(start) == '-') start++;
            boolean neg = start % 2 == 1;

            if (token.length() - start == 1) {
                AST res;
                char c = token.charAt(token.length() - 1);
                if (Character.isUpperCase(c)) {
                    res = new ConstantToken(c == 'T');
                } else {
                    res = new VariableToken(c - 'a');
                }
                if (neg) {
                    return new NegativeToken(res);
                }
                return res;
            }

            if (token.charAt(start) != '(' || token.charAt(token.length() - 1) != ')') {
                throw new RuntimeException("Assertion Failed: " + token);
            }
            start++;


            int depth = 0, center = -1;
            for (int i = start; i < token.length() - 1; i++) {
                char c = token.charAt(i);
                if (c == '(') {
                    depth++;
                } else if (c == ')') {
                    depth--;
                } else if (depth == 0 && (c == '+' || c == '*' || c == '>')) {
                    center = i;
                }
            }

            AST left = AST.parse(token.substring(start, center));
            AST right = AST.parse(token.substring(center + 1, token.length() - 1));
            AST res;
            switch (token.charAt(center)) {
                case '*':
                    res = new AndToken(left, right);
                    break;
                case '>':
                    res = new RightarrowToken(left, right);
                    break;
                case '+':
                    res = new OrToken(left, right);
                    break;
                default:
                    throw new RuntimeException();
            }
            if (neg) {
                return new NegativeToken(res);
            }
            return res;
        }
    }

    static class ConstantToken extends AST {
        boolean value;

        ConstantToken(boolean value) {
            this.value = value;
        }

        @Override
        boolean eval(int var) {
            return value;
        }
    }

    static class VariableToken extends AST {
        int index;

        VariableToken(int index) {
            this.index = index;
        }

        @Override
        boolean eval(int var) {
            return ((var >> index) & 1) == 1;
        }
    }

    static class NegativeToken extends AST {
        AST content;

        NegativeToken(AST content) {
            this.content = content;
        }

        @Override
        boolean eval(int var) {
            return !content.eval(var);
        }
    }

    static class AndToken extends AST {
        AST left, right;

        AndToken(AST left, AST right) {
            this.left = left;
            this.right = right;
        }

        @Override
        boolean eval(int var) {
            return left.eval(var) && right.eval(var);
        }
    }

    static class OrToken extends AST {
        AST left, right;

        OrToken(AST left, AST right) {
            this.left = left;
            this.right = right;
        }

        @Override
        boolean eval(int var) {
            return left.eval(var) || right.eval(var);
        }
    }

    static class RightarrowToken extends AST {
        AST left, right;

        RightarrowToken(AST left, AST right) {
            this.left = left;
            this.right = right;
        }

        @Override
        boolean eval(int var) {
            return !left.eval(var) || right.eval(var);
        }
    }
}

