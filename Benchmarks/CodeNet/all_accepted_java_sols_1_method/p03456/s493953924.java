import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int int1 = scn.nextInt();
        int int2 = scn.nextInt();

        String x = Integer.toString(int1) + Integer.toString(int2);

        int y = Integer.parseInt(x);

        if (Math.sqrt(y) == (double) ((int) Math.sqrt(y))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

