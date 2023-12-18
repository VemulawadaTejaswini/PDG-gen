import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            double n = sc.nextDouble()*16;
            if (n < 0)
                break;
            if (n >= 4096 || n != (int) n)
                System.out.println("NA");
            else
                for (int i = 11; i >= 0; i--)
                    System.out.print((((int) n & 1 << i) > 0 ? 1 : 0) + (i == 4 ? "." : i == 0 ? "\n" : ""));
        }
    }
}

