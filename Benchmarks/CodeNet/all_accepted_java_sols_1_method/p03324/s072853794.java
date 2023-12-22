import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int d = reader.nextInt();
        int n = reader.nextInt();
        System.out.println((int) Math.pow(100, d) * (n + n / 100));
        reader.close();
    }
}