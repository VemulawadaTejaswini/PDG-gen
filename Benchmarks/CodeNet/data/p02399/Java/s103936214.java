public class Main {

    public static void main(String[] args) {
        final String line = readLine();
        System.out.println(calc(line));
    }

    protected static Answer calc0(String input) {
        final int[] ia = split(input);

        final int a = ia[0];
        final int b = ia[1];

        Answer answer = new Answer();

        answer.d = a / b;
        answer.r = a % b;
        answer.f = (float) a / (float) b;

        return answer;
    }

    protected static String calc(String input) {
        return String.valueOf(calc0(input));
    }

    private static int[] split(String s) {
        final String[] s0 = s.split(" ");
        int[] ia = new int[s0.length];

        for (int i = 0; i < s0.length; i++) {
            ia[i] = Integer.parseInt(s0[i]);
        }

        return ia;
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

    static class Answer {
        int d;
        int r;
        float f;
        java.text.Format df = new java.text.DecimalFormat("0.00000");

        @Override
        public String toString() {
            return d + " " + r + " " + df.format(f);
        }
    }
}