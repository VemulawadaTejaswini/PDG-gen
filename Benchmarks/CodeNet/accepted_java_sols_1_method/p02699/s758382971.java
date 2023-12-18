import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer S = input.nextInt();
        Integer W = input.nextInt();

        if (S <= W) System.out.println("unsafe");
        else System.out.println("safe");
    }
}
