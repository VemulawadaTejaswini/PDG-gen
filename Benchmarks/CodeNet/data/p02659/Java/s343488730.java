import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        double a = scn.nextDouble();
        double b = scn.nextDouble();

        a = a * b;

        long ans = (long)a;

        System.out.println(ans);

        scn.close();


    }


}