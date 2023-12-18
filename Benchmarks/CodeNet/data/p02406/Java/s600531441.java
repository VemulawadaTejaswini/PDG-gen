import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        for(i = 1; i <= n; i++) {
            if(i % 3 == 0 || i % 10 == 3 || i / 10 == 3 || i / 100 == 3 || i / 1000 == 3) {
                System.out.print(" " + i);
            }
        }
        System.out.print("\n");
    }
}
