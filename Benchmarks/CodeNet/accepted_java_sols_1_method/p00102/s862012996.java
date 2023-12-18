import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            int[] list = new int[n ];
            for (int i = 0; i < n + 1; i++) {
                if (i == n) {
                    int sum=0;
                    for (int j = 0; j < n; j++) {
                        sum+=list[j];
                        System.out.printf("%5d",list[j] );
                    }
                    System.out.printf("%5d\n",sum);                    
                } else {
                    int sum=0;
                    for (int j = 0; j < n; j++) {
                        int m = sc.nextInt();
                        sum += m;
                        list[j] += m;
                        System.out.printf("%5d",m);
                    }
                    System.out.printf("%5d\n",sum);
                }
            }
        }
    }
}
