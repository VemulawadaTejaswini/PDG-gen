import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Matrix {
    private final int[][] value;
    private static final int M = 1 << 15;

    public Matrix(int[][] value) {
        this.value = value;
    }

    public Matrix(int value) {
        int[][] matrix = new int[1][1];
        matrix[0][0] = value;
        this.value = matrix;
    }

    public static int mod(int x, int y) {
        return (x % y + y) % y;
    }

    public Matrix negate() {
        int[][] matrix = new int[value.length][value[0].length];
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < value[0].length; j++) {
                matrix[i][j] = mod(-value[i][j], M);
            }
        }
        return new Matrix(matrix);
    }

    public Matrix add(Matrix x) {
        int[][] matrix = new int[value.length][value[0].length];
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < value[0].length; j++) {
                matrix[i][j] = mod(value[i][j] + x.value[i][j], M);
            }
        }
        return new Matrix(matrix);
    }

    public Matrix subtract(Matrix x) {
        int[][] matrix = new int[value.length][value[0].length];
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < value[0].length; j++) {
                matrix[i][j] = mod(value[i][j] - x.value[i][j], M);
            }
        }
        return new Matrix(matrix);
    }

    public Matrix multiply(Matrix x) {
        if (x.value.length == 1 && x.value[0].length == 1) {
            return multiply(x.value[0][0]);
        } else if (value.length == 1 && value[0].length == 1) {
            return x.multiply(value[0][0]);
        } else {
            int[][] matrix = new int[value.length][x.value[0].length];
            for (int i = 0; i < value.length; i++) {
                for (int j = 0; j < x.value[0].length; j++) {
                    int sum = 0;
                    for (int k = 0; k < value[0].length; k++) {
                        sum += value[i][k] * x.value[k][j];
                    }
                    matrix[i][j] = mod(sum, M);
                }
            }
            return new Matrix(matrix);
        }
    }

    public Matrix multiply(int x) {
        int[][] matrix = new int[value.length][value[0].length];
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < value[0].length; j++) {
                matrix[i][j] = mod(x * value[i][j], M);
            }
        }
        return new Matrix(matrix);
    }

    public Matrix transpose() {
        int[][] matrix = new int[value[0].length][value.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = value[j][i];
            }
        }
        return new Matrix(matrix);
    }

    public Matrix mergeBottom(Matrix x) {
        int[][] matrix = new int[value.length + x.value.length][value[0].length];
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < value[0].length; j++) {
                matrix[i][j] = value[i][j];
            }
        }
        for (int i = 0; i < x.value.length; i++) {
            for (int j = 0; j < x.value[0].length; j++) {
                matrix[i + value.length][j] = x.value[i][j];
            }
        }
        return new Matrix(matrix);
    }

    public Matrix mergeRight(Matrix x) {
        int[][] matrix = new int[value.length][value[0].length + x.value[0].length];
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < value[0].length; j++) {
                matrix[i][j] = value[i][j];
            }
        }
        for (int i = 0; i < x.value.length; i++) {
            for (int j = 0; j < x.value[0].length; j++) {
                matrix[i][j + value[0].length] = x.value[i][j];
            }
        }
        return new Matrix(matrix);
    }

    public Matrix get(Matrix mi, Matrix mj) {
        int[][] matrix = new int[mi.value[0].length][mj.value[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = value[mi.value[0][i] - 1][mj.value[0][j] - 1];
            }
        }
        return new Matrix(matrix);
    }

    public void show() {
        for (int i = 0; i < value.length; i++) {
            boolean space = false;
            for (int j = 0; j < value[0].length; j++) {
                if (space) {
                    System.out.print(" ");
                }
                System.out.print(value[i][j]);
                space = true;
            }
            System.out.println();
        }
    }
}

class Evaluator {
    private static char[] input;
    private static int ptr;
    private static Map<String, Matrix> env;

    private static Matrix expr() {
        Matrix m = term();
        while (input[ptr] == '+' || input[ptr] == '-') {
            if (input[ptr] == '+') {
                ptr++;
                m = m.add(term());
            } else {
                ptr++;
                m = m.subtract(term());
            }
        }
        return m;
    }

    private static Matrix term() {
        Matrix m = factor();
        while (input[ptr] == '*') {
            ptr++;
            m = m.multiply(factor());
        }
        return m;
    }

    private static Matrix factor() {
        Matrix m;
        if (input[ptr] == '-') {
            ptr++; 
            m = factor().negate();
        } else {
            m = primary();
        }
        return m;
    }

    private static Matrix primary() {
        Matrix m = null;
        if (Character.isDigit(input[ptr])) {
            m = inum();
        } else if (Character.isUpperCase(input[ptr])) {
            m = var();
        } else if (input[ptr] == '[') {
            m = matrix();
        } else if (input[ptr] == '(') {
            ptr++;
            m = expr();
            assert input[ptr] == ')';
            ptr++;
        } 
        if (m != null) {
            while (input[ptr] == '(' || input[ptr] == '\'') {
                if (input[ptr] == '(') {
                    ptr++;
                    final Matrix mi = expr();
                    assert input[ptr] == ',';
                    ptr++;
                    final Matrix mj = expr();
                    assert input[ptr] == ')';
                    ptr++;
                    m = m.get(mi, mj);
                } if (input[ptr] == '\'') {
                    ptr++;
                    m = m.transpose();
                }
            }
        }
        return m;
    }

    private static Matrix inum() {
        StringBuilder digits = new StringBuilder();
        while (Character.isDigit(input[ptr])) {
            digits.append(input[ptr]);
            ptr++;
        }
        return new Matrix(Integer.valueOf(digits.toString()));
    }

    private static Matrix var() {
        StringBuilder name = new StringBuilder();
        while (Character.isUpperCase(input[ptr])) {
            name.append(input[ptr]);
            ptr++;
        }
        return env.get(name.toString());
    }

    private static Matrix matrix() {
        ptr++;
        Matrix m = rowSeq();
        assert input[ptr] == ']';
        ptr++;
        return m;
    }

    private static Matrix rowSeq() {
        Matrix m = row();
        while (input[ptr] == ';') {
            ptr++;
            m = m.mergeBottom(row());
        }
        return m;
    }

    private static Matrix row() {
        Matrix m = expr();
        while (input[ptr] == ' ') {
            ptr++;
            m = m.mergeRight(row());
        }
        return m;
    }

    public static Matrix eval(char[] input, Map<String, Matrix> env) {
        Evaluator.input = input;
        Evaluator.ptr = 0;
        Evaluator.env = env;
        Matrix result = expr();
        assert input[ptr] == '.';
        return result;
    }
}

class Main {
    private static void solve() {
        final Scanner scanner = new Scanner(System.in).useDelimiter("\\n");

        while (true) {
            final int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            final Map<String, Matrix> env = new HashMap<String, Matrix>();
            for (int i = 0; i < n; i++) {
                String[] input = scanner.next().split("=");
                Matrix result = Evaluator.eval(input[1].toCharArray(), env);
                result.show();
                env.put(input[0], result);
            }
            System.out.println("-----");
        }
    }

    public static void main(String... args) {
        solve();
    }
}