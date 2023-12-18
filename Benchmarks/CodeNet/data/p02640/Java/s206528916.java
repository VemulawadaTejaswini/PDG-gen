import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        if(Y%2 == 1 || 2*X > Y && Y < 4*X)
            System.out.println("NO");
        System.out.println("YES");
    }
}