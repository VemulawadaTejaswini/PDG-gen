import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();

        int[] taste = new int[n];
        int[] min = {-1, 300};
        for (int i = 0; i < n; i++) {
            taste[i] = i + l;
            if (min[1] >= Math.abs(taste[i])) {
                min[0] = i;
                min[1] = Math.abs(taste[i]);
            }
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (i != min[0]) {
                result += taste[i];
            }
        }

        System.out.println(result);
    }
}
