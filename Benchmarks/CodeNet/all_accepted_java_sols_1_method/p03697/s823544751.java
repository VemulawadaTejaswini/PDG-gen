import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // 入力(A B)
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;

        System.out.println((sum <= 9) ? sum : "error");
        sc.close();
    }    
}