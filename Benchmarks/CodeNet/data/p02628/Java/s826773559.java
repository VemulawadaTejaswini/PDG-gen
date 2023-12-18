import java.util.Arrays;
import java.util.Scanner;

public class Character {
    public static void main(String[] args) {
        int n;
        int k;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        k = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr);
        int sum=0;
        for (int i = 0; i <k ; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
