import java.util.Scanner;

public class Main<i> {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int x = sc.nextInt();
        int s = x - (k - 1);
        int e = x + (k - 1);

        for (int i = s; i <= e; i++) {
            System.out.println(i);
        }
    }
}