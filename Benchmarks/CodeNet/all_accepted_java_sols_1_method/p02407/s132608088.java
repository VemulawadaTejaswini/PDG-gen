import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] as = new int[n];
        for (int i = 0; i < n; i++) as[i] = input.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) sb.append(as[i]).append(' ');
        System.out.println(sb.toString().trim());
    }
}
