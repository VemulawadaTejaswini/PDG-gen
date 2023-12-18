import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double a = Double.parseDouble(scn.next());
        double b = 3;
        System.out.println((int) Math.pow(a, b));
        scn.close();
    }
}