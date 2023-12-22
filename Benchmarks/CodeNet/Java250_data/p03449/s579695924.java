import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        int i = 0;
        while(i<n){
            a[i] = sc.nextInt();
            i++;
        }

        i = 0;
        while(i<n){
            b[i] = sc.nextInt();
            i++;
        }

        int max = a[0];
        for(int j = 0; j<n; j++) {
            max += b[j];
        }
        
        int sum;
        for(int j = 1; j<n; j++) {
            sum = 0;
            for(i = 0; i<n; i++) {
                if(i<=j)
                   sum+= a[i];
                if(i>=j)
                    sum += b[i];
            }
            if(sum > max) {
                max = sum;
            }
        }

        System.out.println(max);
    }
}
