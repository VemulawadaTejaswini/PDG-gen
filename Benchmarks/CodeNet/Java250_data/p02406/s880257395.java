public class Main {

    protected static String calc(String input) {
        final int data = Integer.parseInt(input);

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= data; i++) {
            if (check(i)) {
                sb.append(' ');
                sb.append(i);
            }
        }

        return sb.toString();
    }

    static boolean check(int x) {
        if (x % 3 == 0) {
            return true;
        }
        return check0(x);
    }

    static boolean check0(int x) {
        if (x % 10 == 3) {
            return true;
        }
        x /= 10;
        if (x > 0) {
            return check0(x);
        }
        return false;
    }

    public static void main(String[] args) {
        final String line = readLine();
        System.out.println(calc(line));
    }

    private static String readLine() {
        java.util.Scanner s = null;
        try {
            s = new java.util.Scanner(System.in);
            return s.nextLine();
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }
}