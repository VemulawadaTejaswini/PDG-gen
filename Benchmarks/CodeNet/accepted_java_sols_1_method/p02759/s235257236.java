import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int k;

        if (n % 2 == 0) {
            k = n / 2;
        } else {
            k = (n/2) + 1;
        }

        System.out.println(k);




    }
}