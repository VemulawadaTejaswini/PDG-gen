import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int A = sc.nextInt();

        System.out.println((H / A) + (H % A == 0 ? 0 : 1));
    }
}
