import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        int a = A.nextInt();
        int b = A.nextInt();
        A.close();
        if ((a+b)%2 == 1) {
            System.out.println(((a + b) / 2) + 1);
        } else {
            System.out.println((a + b) / 2);
        }
    }
}
