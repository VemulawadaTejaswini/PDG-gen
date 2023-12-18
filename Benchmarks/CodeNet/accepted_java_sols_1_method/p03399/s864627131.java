import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(Math.min(input.nextInt(), input.nextInt()) + Math.min(input.nextInt(), input.nextInt()));
    }
}
