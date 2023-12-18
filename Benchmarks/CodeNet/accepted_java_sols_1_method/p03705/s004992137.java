import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long min = b;
        long max = a;
        for (int i = 0; i < n-1; i++) {
            min += a;
            max += b;
        }
        long result = max - min + 1;
        if (result < 0){
            System.out.println(0);
        }else {
            System.out.println(result);
        }
    }
}
