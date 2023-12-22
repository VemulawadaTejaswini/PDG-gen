import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String c = sc.nextLine();

        int[] r = new int[n];
        int[] w = new int[n];
        int lastIndexR = 0;
        int lastIndexW = 0;
        for (int i = 0; i < n; i++) {
            if (c.charAt(i) == 'R') {
                r[lastIndexR] = i;
                lastIndexR++;
            } else {
                w[lastIndexW] = i;
                lastIndexW++;
            }
        }
        lastIndexR--;
        lastIndexW--;

        int maxIndexR = lastIndexR;
        int minIndexW = 0;
        int ans = 0;
        if (lastIndexR >= 0 && lastIndexW >= 0) {
            while (r[maxIndexR] > w[minIndexW]) {
                ans++;
                maxIndexR--;
                minIndexW++;

                if (maxIndexR < 0) {
                    break;
                } else if (minIndexW > lastIndexW) {
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}