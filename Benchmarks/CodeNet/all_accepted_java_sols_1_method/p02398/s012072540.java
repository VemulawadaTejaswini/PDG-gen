
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int a = sc.nextInt();
    static int b = sc.nextInt();
    static int c = sc.nextInt();
    public static void main(String[] args) {
        int count = 0;
        for (int i = a; i <= b; i++){
            if (c % i == 0)
                count++;
        }
        System.out.println(count);
    }
}

