
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        char[] S = scanner.next().toCharArray();
        char[] T = scanner.next().toCharArray();
        
        for (int i = 0 ; i < N ; i++) {
            System.out.print(S[i]);
            System.out.print(T[i]);
        }
        System.out.println();
    }
}
