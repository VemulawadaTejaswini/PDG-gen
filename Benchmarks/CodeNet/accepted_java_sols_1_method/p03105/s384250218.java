import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int count = 0;
        count = B/A;
        if (count > C) {
            count = C;
        }

        System.out.println(count);

    }

}
