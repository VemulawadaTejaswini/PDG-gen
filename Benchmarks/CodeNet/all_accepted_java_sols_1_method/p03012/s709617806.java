import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < w.length; i++) {
            w[i] = sc.nextInt();
        }
        int result = 0;
        for (int i = 0; i < w.length - 1; i++) {
            int s1 = 0, s2 = 0;
            for (int j = 0; j < w.length; j++) {
                if (j <= i) {
                    s1 += w[j];
                } else {
                    s2 += w[j];
                }
            }
            if (i == 0) {
                result = Math.abs(s1 - s2);
            } else {
                result = Math.min(result, Math.abs(s1 - s2));
            }
        }
        System.out.println(result); 
        sc.close();
    }
}