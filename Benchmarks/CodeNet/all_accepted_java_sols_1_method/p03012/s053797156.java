import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int w[] = new int[n];

        int max[] = new int[n];

        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
        }


        int min = 0;

        for (int i = 1; i < n; i++) {
            int left = 0;
            int right = 0;
            for (int j = 0; j < i; j++) {
                left += w[j];
            }
            for (int k = 0; k < (n - i); k++) {
                right += w[i+k];
            }

            if((Math.abs(left-right) <= min) || min == 0){
                min = Math.abs(left-right);
            }
        }
        System.out.println(min);

        sc.close();
    }
}