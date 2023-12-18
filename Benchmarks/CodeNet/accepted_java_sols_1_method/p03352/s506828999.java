import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int ret = 1;
        for (int i = 2; i < X; i++) {
            int a = i;
            while((a * i) <= X) {
                a *= i;
            }
            if ( a != i && ret < a ) {
                ret = a;
            }
        }
        System.out.println(ret);
    }
}
