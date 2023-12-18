import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(),
            B = sc.nextInt(),
            C = sc.nextInt();

        if (C - (A - B)< 0) {
            System.out.println(0);
        } else {
            System.out.println(C - (A - B ));
        }
    }
}