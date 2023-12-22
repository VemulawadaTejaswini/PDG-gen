import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
        double oneLength = length / 3;
        double result = oneLength * oneLength * oneLength;
        System.out.println(result);
    }
}
