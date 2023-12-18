import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int longest = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            longest = Math.max(longest, temp);
            sum += temp;
        }
        if (sum-longest > longest) System.out.println("Yes");
        else System.out.println("No");
    }
}