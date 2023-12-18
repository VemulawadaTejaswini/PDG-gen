import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int result = 0;
        result += (X / 500) * 1000;
        int remain = X % 500;
        result += (remain / 5) * 5;
        System.out.println(result);
    }
}
