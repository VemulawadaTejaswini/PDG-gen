import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N, M;
        N = input.nextInt();
        M = input.nextInt();
        if (N==M)
        System.out.print("Yes\n");
        else System.out.print("No\n");
    }
}
