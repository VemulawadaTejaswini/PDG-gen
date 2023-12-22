
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static int a[] = new int[n];

    public static void main(String[] args) {
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for (int i = n - 1; i >= 0; i--){
            System.out.print(a[i]);
            if (i != 0){
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

