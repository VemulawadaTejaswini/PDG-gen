import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
        long sum = 0, count1 = 0;
        for(int i = 0 ; i < n ; i++) {
            sum += a[i];
            if(i % 2 == 0 && sum <= 0) {
                count1 += Math.abs(sum) + 1;
                sum = 1;
            } else if(i % 2 == 1 && sum >= 0) {
                count1 += sum + 1;
                sum = -1;
            }
        }
        
        sum = 0;
        long count2 = 0;
        for(int i = 0 ; i < n ; i++) {
            sum += a[i];
            if(i % 2 == 0 && sum >= 0) {
                count2+= sum + 1;
                sum = -1;
            } else if(i % 2 == 1 && sum <= 0) {
                count2 += Math.abs(sum) + 1;
                sum = 1;
            }
        }
        System.out.println(Math.min(count1, count2));
    }
}
