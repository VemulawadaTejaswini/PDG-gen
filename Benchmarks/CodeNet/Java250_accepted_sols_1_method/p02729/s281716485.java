import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        int count = 0;
        for (int i = 0 ; i < N ; i++) {
            for (int j = i + 1 ; j < N ; j++) {
                count++;
            }
        }

        for (int i = 0 ; i < M ; i++) {
            for (int j = i + 1 ; j < M ; j++) {
                count++;
            }
        }

        System.out.println(count);
    }
}
