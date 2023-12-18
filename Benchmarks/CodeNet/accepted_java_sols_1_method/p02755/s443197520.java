import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        //A <= 0.08x < A + 1
        //B <= 0.10x < B + 1
        
        int axmin = (int)(A / 0.08);
        int axmax = (int)((A+1) / 0.08);
        int bxmin = B * 10;
        int bxmax = (B+1) * 10;
        
        int ans = -1;
        for(int i = 1; i <= 1009; i++) {
            if((int)(0.08 * i) == A && (int)(0.1 * i) / 1 == B) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
        
    }
}