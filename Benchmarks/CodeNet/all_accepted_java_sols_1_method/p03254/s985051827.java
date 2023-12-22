import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(a);

        int count = 0;
        for(int i=0; i<n; i++) {
            if(i == n-1) {
                if(x - a[i] == 0){
                    count++;
                    break;
                }
            } else if(x - a[i] >= 0) {
                x -= a[i];
                count++;
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}
