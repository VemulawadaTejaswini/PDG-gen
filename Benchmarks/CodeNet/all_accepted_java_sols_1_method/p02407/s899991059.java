import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n;
        int a[] = new int[100];
        Scanner num = new Scanner(System.in);
        
        n = num.nextInt();
        for(int i = 0; i < n; i++) {
            a[i] = num.nextInt();
        }

        for(int i = n - 1; i >= 0; i--) {
            System.out.print(a[i]);
            if(i == 0) {
                System.out.print("\n");
            } else {
                System.out.print(" ");
            }
        }
        
    }
}
