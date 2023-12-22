import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        int[] n = new int[] {p+q, q+r, r+p};
        int min = p+q;
        for (int i : n) {
            if (min >= i) {
                min = i;
            }
        }
        System.out.println(min);
    }

}
