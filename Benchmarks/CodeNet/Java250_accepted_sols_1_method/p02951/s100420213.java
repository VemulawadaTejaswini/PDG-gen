import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

      Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int differnce = A-B;

        int C = sc.nextInt();

        if (C > differnce) {
            System.out.println(C-differnce);
        } else {
            System.out.println(0);
        }

    }
}