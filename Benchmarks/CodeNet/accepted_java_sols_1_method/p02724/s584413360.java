import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        int happy = (x / 500) * 1000;
        x = x % 500;
        happy += (x / 5) * 5;

        System.out.println(happy);
    }
}
