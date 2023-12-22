import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int N = sc.nextInt();
        
        int powD = 1;
        for(int i = 0; i < D; i++){
            powD *= 100;
        }
        int ans = N * powD;
        if((ans == 100 && powD == 1) || (ans == 10000 && powD == 100) || (ans == 1000000 && powD == 10000)){
            System.out.println(ans + 1 * powD);
        }else{
            System.out.println(ans);
        }
        
    }
}
