import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        sc.close();

        int count=0;
        for (int i = A; i < B; i++) {
            if (C <= i && i < D) {
                count++;
            }
        }
        System.out.println(count);
    }
}