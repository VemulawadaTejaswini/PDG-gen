import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt(), B = scan.nextInt();
        int tmp = A - B * 2;
        if (tmp > 0) {
            System.out.println(tmp);
        } else {
            System.out.println("0");
        }
    }
}
