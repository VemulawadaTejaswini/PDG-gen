import java.util.Scanner;

class Main {
    public static class Calculator {
        private char[] input;
        private int ptr;

        public Calculator(char[] input) {
            this.input = input;
            this.ptr = 0;
        }

        private int expr() {
            int value = term();
            while (input[ptr] == '+' || input[ptr] == '-') {
                if (input[ptr] == '+') {
                    ptr++;
                    value += term();
                } else {
                    ptr++;
                    value -= term();
                }
            }
            return value;
        }

        private int term() {
            int value = factor();
            while (input[ptr] == '*' || input[ptr] == '/') {
                if (input[ptr] == '*') {
                    ptr++;
                    value *= factor();
                } else {
                    ptr++;
                    value /= factor();
                }
            }
            return value;
        }

        private int factor() {
            int value;
            if (input[ptr] == '(') {
                ptr++;
                value = expr();
                assert input[ptr] == ')';
                ptr++;
            } else {
                value = number();
            }
            return value;
        }

        private int number() {
            StringBuilder number = new StringBuilder();
            while (Character.isDigit(input[ptr])) {
                number.append(input[ptr++]);
            }
            return Integer.valueOf(number.toString());
        }

        public int run() {
            int value = expr();
            assert input[ptr] == '=';
            return value;
        }
    }

    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            char[] input = scanner.next().toCharArray();
            System.out.println(new Calculator(input).run());
        }
    }

    public static void main(String... args) {
        solve();
    }
}