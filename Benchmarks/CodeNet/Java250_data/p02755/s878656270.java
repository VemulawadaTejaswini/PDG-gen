import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here! 
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        for (int i = 1; i <= 1001001009; i++) {
            double tmp1 = i*0.08;
            int tmpa = (int)tmp1;
            double tmp2 = i*0.1;
            int tmpb = (int)tmp2;
            
            if (tmpa == a && tmpb == b) {
                System.out.println(i);
                return;
            }
            
            if (tmpa > a && tmpb > b) {
                System.out.println(-1);
                return;
            }
        }
    }
}