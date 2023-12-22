import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
            sum+=l[i];
        }
        
        for (int i = 0; i < n; i++) {
            if (l[i] >= sum - l[i]) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
