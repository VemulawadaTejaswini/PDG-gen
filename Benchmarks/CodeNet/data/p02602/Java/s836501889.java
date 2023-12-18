import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n + 1];
        arr[0] = 1;
        for(int i = 1; i <= n; i++){
            arr[i] = sc.nextInt();
            if(i > k) {
                if (arr[i] > arr[i - k])
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
        }
    }
}