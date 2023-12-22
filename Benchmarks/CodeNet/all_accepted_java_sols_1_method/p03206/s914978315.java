import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        if (day == 25) System.out.println("Christmas");
        else if (day == 24) System.out.println("Christmas Eve");
        else if (day == 23) System.out.println("Christmas Eve Eve");
        else if (day == 22) System.out.println("Christmas Eve Eve Eve");
    }
}