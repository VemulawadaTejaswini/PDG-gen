import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int[] a = new int[4];
        for (int i = 0; i < 4; i++) {
            a[i] = cin.nextInt();
        }
        System.out.println(Math.min(a[0], a[1]) + Math.min(a[2], a[3]));
    }

}
