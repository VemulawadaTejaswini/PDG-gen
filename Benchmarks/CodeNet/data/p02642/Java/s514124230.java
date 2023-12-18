import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n == 1){
            System.out.println(0);
            return;
        }

        int a[] = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);
        int count = n;
        if(a[0] == a[1]){ count--; }
        for(int i = n-1; i >= 0; i--){
            for(int j = i-1; j >= 0; j--){
                if(a[i] % a[j] == 0){
                    count--;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}