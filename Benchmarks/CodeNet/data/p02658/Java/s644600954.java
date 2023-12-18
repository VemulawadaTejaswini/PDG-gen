import java.util.Scanner;

class Multiplication1 {
    public static void main(String args[]) throws Exception {
        Scanner s = new Scanner(System.in);
        long c = 1000000000000000000l;
        int a = s.nextInt();
        long m = 1;
        for (int i = 0; i < a; i++) {
            long b = s.nextLong();
            m = m * b;
        }
        if (m > c) System.out.println("" + (-1));
        else System.out.println("" + m);
    }
}