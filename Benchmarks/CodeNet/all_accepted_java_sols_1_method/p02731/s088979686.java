import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        double l = stdIn.nextDouble();

        System.out.println(l*l*l/27);
    }
}