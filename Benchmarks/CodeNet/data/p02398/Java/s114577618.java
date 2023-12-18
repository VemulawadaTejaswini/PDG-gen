import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt()};
        int count = 0;
        for (int i = a[0]; i <= a[1]; i++) {
            if (a[2] % i == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}