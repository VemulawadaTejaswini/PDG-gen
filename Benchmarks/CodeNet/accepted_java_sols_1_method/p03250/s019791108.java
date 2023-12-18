import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int b = reader.nextInt();
        int c = reader.nextInt();
        reader.close();
        System.out.println(a > b ? (b + (a > c ? (10 * a + c) : (10 * c + a))) : (a + (b > c ? (10 * b + c) : (10 * c + b))));
    }
}