import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        while (k-->=1){
        int a=sc.nextInt();
        int b=sc.nextInt();
        for (int i=0;i<ar.length;i++){
            if (ar[i]==a){
                ar[i]=b;
            }

            }
        long sum=0;
        for (int i=0;i<n;i++){
            sum+=ar[i];


        }
            System.out.println(sum);
        }
    }

}
