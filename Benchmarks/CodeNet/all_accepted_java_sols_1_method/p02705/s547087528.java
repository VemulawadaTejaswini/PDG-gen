import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        double r = stdIn.nextDouble();

        System.out.println(Math.PI * r * 2);
    }
}