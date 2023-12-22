
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double R = sc.nextInt();
        double G = sc.nextInt();
        System.out.println((int) (G * 2 - R));
    }
}