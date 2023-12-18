import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bar[] = new int[n];
        for (int i = 0; i < n; ++i){
            bar[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n-1; ++i){
            if (bar[i] > bar[i+1]){
                bar[i+1] += 1;
                if (bar[i] > bar[i+1]){
                System.out.println("No");
                System.exit(0);
                }
            }
        }
        
        System.out.println("Yes");
    }
}