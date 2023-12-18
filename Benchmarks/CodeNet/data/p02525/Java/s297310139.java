import java.util.Scanner;
 
public class  Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        for (;;) {
            int num = sc.nextInt();
            if (num == 0)break;
System.out.printf("\n");
 
            int[] ten;
            ten = new int[num];
            int ttl = 0;
 
            for (int i = 0; i < num; i++) {
                ten[i] = sc.nextInt();
                ttl = ttl + ten[i];
            }
 
            double ave = ttl / num;
            double ans = 0;
            double temp = 0;
            for (int i = 0; i < num; i++) {
                temp = ten[i] - ave;
                temp = temp * temp;
                ans = ans + temp;
            }
            ans = Math.sqrt(ans / num);
            System.out.printf("%f", ans);
        }
    }
}