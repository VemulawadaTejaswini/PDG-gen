import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ans[] = new int[n];
        for(int i = 0; i < n; i++) {
            int a = scan.nextInt();
            ans[a - 1] = i + 1;
        }
        for(int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
