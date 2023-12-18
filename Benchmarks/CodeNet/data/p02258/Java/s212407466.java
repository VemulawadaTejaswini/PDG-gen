import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] r = new int[n];

        int min = 1000000000;


        for(int i = 0; i < n; i++) {
            r[i] = sc.nextInt();
        }

        int maxProfit = r[1] - r[0];

        for(int i = 0; i < n - 1; i++) {
            if(r[i] < min) {
                min = r[i];
                for(int j = i + 1; j < n; j++) {
                    int dif = r[j] - r[i];
                    if(dif > maxProfit) maxProfit = dif;
                }
            }
        }

        System.out.println(maxProfit);
    }

}
