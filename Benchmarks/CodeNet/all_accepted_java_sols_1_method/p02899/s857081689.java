import java.util.*;
public class Main { 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            int val = sc.nextInt();
            arr[val - 1] = i + 1;
        }
        for(int i = 0; i < n; i++)
            System.out.println(arr[i]);
    }

}