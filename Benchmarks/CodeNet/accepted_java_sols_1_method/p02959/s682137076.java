import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long[] a = new long[100005];
        long[] b = new long[100005];
        for(int i = 0; i < n + 1; ++i){
            a[i] = input.nextLong();
        }
        for(int i = 0; i < n; ++i){
            b[i] = input.nextLong();
        }
        long sum = 0;
        for(int i = 0; i < n; ++i){
            if(a[i] <= b[i]){
                sum += a[i];
                b[i] -= a[i];
            }
            else{
                sum += b[i];
                b[i] = 0;
            }
            if(a[i + 1] <= b[i]){
                sum += a[i + 1];
                b[i] -= a[i + 1];
                a[i + 1] = 0;
            }
            else{
                sum += b[i];
                a[i + 1] -= b[i];
                b[i] = 0;
            }
        }
        System.out.println(sum);
    }
}
