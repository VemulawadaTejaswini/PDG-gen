import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        in.close();

        while (b > 0) {
            int temporary = a;
            a = b;
            b = temporary % b;
        }
        System.out.println(a);
    }
}

