import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        System.out.println(Y%2 == 0 && X*2 <= Y && Y <= X*4 ? "Yes" : "No");
    }
}