import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[1000];
        for(int i = 1; i <= 1000; i++) {
            if((a % i == 0) && (b % i == 0)) {
                arr[i] = i;
            }
        }
        int count = 0;
        for(int i = 999; i >= 0; i--) {
            if(arr[i] > 0) {
                count++;
            }
            if(count == k) {
                System.out.println(i);
                break;
            }
        }
    }
}
