import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        if(n % 2 == 0){
            for(int i = 0; i < n; i += 2){
                System.out.print(a[n - i - 1] + " ");
            }
            for(int i = 0; i < n; i += 2){
                System.out.print(a[i] + " ");
            }
        } else {
            for(int i = 0; i < n; i += 2){
                System.out.print(a[n - i - 1] + " ");
            }
            for(int i = 1; i < n; i += 2){
                System.out.print(a[i] + " ");
            }
        }
    }
}
