import java.util.Scanner;

class Main {
    public static void main(String... args) {
        String S = IN.next();
        String T = IN.next();
        int z = S.length();
        boolean flag = false;
        for (int i = 0; i < z; i++) {
            String x = S.substring(z - i - 1) + S.substring(0, z - i - 1);
            if (x.equals(T)) {
                flag = true;
                break;
            }
        }
        puts(flag ? "Yes" : "No");
    }
    static final Scanner IN = new Scanner(System.in);
    static <T> void puts(T arg) { System.out.println(arg); }
}