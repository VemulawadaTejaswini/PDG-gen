import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int gohyaku = (x/500) * 1000;
        int go = ((x%500) / 5) * 5;

        System.out.println(gohyaku + go);
    }
}