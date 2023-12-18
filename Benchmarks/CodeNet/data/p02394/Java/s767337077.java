public class Main {

    public static void main(String[] args) {
        final String line = readLine();
        System.out.println(calc(line));
    }

    protected static String calc(String input) {
        final int[] ia = split(input);

        int W = ia[0];
        int H = ia[1];
        int x = ia[2];
        int y = ia[3];
        int r = ia[4];

        int xx = x + r;
        int yy = y + r;

        if (xx > W || yy > H) {
            return "No";
        }

        return "Yes";
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
}