import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 0, left = 0, right = 0;
        for (int i = 0; i < n; i++) {
            left = scanner.nextInt();
            right = scanner.nextInt();
            result += right - left + 1;
        }
        System.out.println(result);
    }
}