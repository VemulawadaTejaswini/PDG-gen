import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] n = new int[4];
        int[] Ans = {1, 4, 7, 9};
        for (int i = 0; i < 4; i++) {
            n[i] = sc.nextInt();
        }

        Arrays.sort(n);
        boolean isAns = true;
        
        for (int i = 0; i < 4; i++) {
            if (n[i] != Ans[i])
                isAns = false;
        }
        
        System.out.println(isAns ? "YES" : "NO");
    }
}
