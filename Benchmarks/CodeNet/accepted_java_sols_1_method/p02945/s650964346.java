import java.util.Scanner;


// 138_a
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        System.out.println(Math.max(Math.max(n1 + n2, n1 - n2), n1 * n2));

    }

}
