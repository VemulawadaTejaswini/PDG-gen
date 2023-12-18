import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int int1 = scn.nextInt();
        int int2 = scn.nextInt();

        if (int1*int2 %2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}

