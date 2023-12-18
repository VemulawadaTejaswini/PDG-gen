import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int D = sc.nextInt();
        int diff = 25 - D;

        System.out.print("Christmas");
        for (int i = 0; i < diff; i++) {
            System.out.print(" Eve");
        }

        System.out.println();
    }

}



