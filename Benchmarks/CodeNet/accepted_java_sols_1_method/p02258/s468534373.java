import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
         
        int min = 2000000000;
        int ans = -2000000000;
        for(int i = 0; i < n; i++) {
            int r = sc.nextInt();
            ans = Math.max(ans, r - min);
            min = Math.min(min, r);
        }
 
        System.out.println(ans);
    }
}
