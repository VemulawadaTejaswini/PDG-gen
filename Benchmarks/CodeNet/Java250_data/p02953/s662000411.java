import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] h = new int[n];
        int pre = n-1;
        boolean yes = true;

        for (int i = 0; i < n; i++) {
            h[i] = scanner.nextInt();
        }
        for (int i = n-2; i >= 0 ; i--) {
            if(h[i] - h[pre] == 1) {
                h[i]--;
            } else if(h[i] - h[pre] > 1) {
                yes = false;
                break;
            }
            pre--;
        }

        if(yes){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

