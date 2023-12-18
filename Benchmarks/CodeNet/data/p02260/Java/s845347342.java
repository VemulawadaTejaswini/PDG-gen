import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];
        int i;
        int j;
        int minj;
        int a;
        int  count=0;
        for (i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            minj=i;
            for (j = i; j < n; j++) {
                if (num[j] < num[minj]) {
                   minj=j;
                }
            }
            if(i!=n-1) {
                System.out.printf("%d ", num[minj]);
            }else{
                System.out.printf("%d",num[minj]);
            }
            a = num[i];
            num[i] = num[minj];
            num[minj] = a;
            if(num[i]!=a)count=count+1;
        }
        System.out.printf("\n");
        System.out.println(count);
    }
}
