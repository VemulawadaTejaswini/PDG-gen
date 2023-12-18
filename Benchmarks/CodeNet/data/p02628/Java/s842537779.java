import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] price = new int[n];
        for(int i = 0; i < n; i++)
            price[i] = sc.nextInt();
        Arrays.sort(price);
        int sum = 0;
        for(int i = 0; i < k; i++)
            sum += price[i];
        System.out.println(sum);
    }
}