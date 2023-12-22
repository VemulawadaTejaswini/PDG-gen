import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int[] taste = new int[n];
        int eat=200;
        int pai=0;

        for (int i = 0; i < n; i++) {
            taste[i] = l+i;
            pai+=l+i;
            if (Math.abs(taste[i]) < Math.abs(eat)) {
                eat = taste[i];
            }
        }

        System.out.println(pai - eat);
    }
}