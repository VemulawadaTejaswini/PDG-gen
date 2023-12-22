import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.next();
        long n = Long.parseLong(line);
        for (int b = 1; b < 63; b <<= 1) {
            n |= (n >>> b);
        }
        System.out.println(n);
    }
}