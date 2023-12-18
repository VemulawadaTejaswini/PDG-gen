import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        boolean flg = true;
        int count = 0;
        while(flg) {
            flg = false;
            for(int j = n-1; j > 0; j--) {
                if(a[j] < a[j-1]) {
                    int tmp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = tmp;
                    flg = true;
                    count += 1;
                }
            }
        }
        System.out.printf("%d", a[0]);
        for(int i = 1; i < n; i ++) {
            System.out.printf(" %d", a[i]);
        }
        System.out.printf("\n");
        System.out.println(count);
    }
}
