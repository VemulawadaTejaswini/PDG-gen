import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        int ans = 1;
        
        //「2倍する」とは「ans自身を足す」に等しい。
        //よって、ansとKのうち小さい方を足せばよい。
        while(N > 0){
            ans += Math.min(ans, K);
            N--;
        }
        System.out.println(ans);
    }
}
