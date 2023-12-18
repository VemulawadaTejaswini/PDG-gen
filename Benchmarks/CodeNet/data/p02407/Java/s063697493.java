
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t[] = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = scanner.nextInt();
        }

        for (int i = n-1; i >= 0; i--) {
            System.out.print(t[i]);
            if(i != 0){
                System.out.print(" ");
            }
        }
        System.out.println("");

    }
}

