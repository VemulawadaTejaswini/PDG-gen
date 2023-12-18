import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = input.nextInt();
        Arrays.sort(a);
        int sum = 0;
        for(int j = 0; j < k; j++)
            sum+=a[j];
        System.out.println(sum);
    }
}
