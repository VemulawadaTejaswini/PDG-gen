import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int flag = 1, count = 0, i;
        int[] a = new int[100];

        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        while (flag == 1) {
            flag = 0;
            for (i = n - 1; i >= 1; i--) {
                if (a[i] < a[i - 1]) {
                    a[i] = a[i] + a[i - 1];
                    a[i - 1] = a[i] - a[i - 1];
                    a[i] = a[i] - a[i - 1];
                    count++;
                    flag = 1;
                }
            }
        }
        for (i = 0; i < n; i++) {
            if(i==n-1){
                System.out.printf("%d\n",a[i]);
            }else{
            System.out.printf("%d ", a[i]);
            }
        }
        System.out.printf("%d\n", count);
        sc.close();
    }
}
