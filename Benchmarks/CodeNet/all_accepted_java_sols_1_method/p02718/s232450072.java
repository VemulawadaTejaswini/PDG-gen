import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        float v = (float)sum / (4 * m);
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(a[i] >= v){
                count++;
            }
        }
        if(count < m){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}