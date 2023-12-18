import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        int d = sc.nextInt();

        int count = 0;
        for (int i = L; i <= R; i++) {
            count += i % d == 0 ? 1 : 0;
        }
        System.out.println(count);
    }
}