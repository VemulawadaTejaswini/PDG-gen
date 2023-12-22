import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();

        int[] cum = new int[n+1];

        for (int i=0; i < n; i++) {
            cum[i+1] = cum[i] + sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        for (int i=0; i < n; i++) {
            min = Math.min(min, Math.abs((cum[n] - cum[i]) - (cum[i] - cum[0])));
        }

        System.out.println(min);
    }

}
