import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int P = sc.nextInt();
        sc.close();

        int tmp=0;

        tmp = A * 3 + P;

        System .out.println(tmp / 2);

    }
}