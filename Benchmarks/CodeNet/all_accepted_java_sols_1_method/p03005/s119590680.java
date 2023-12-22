import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int ans = 0;
        if(K==1){
            System.out.println(0);
        }else{
            ans = N-K;
            System.out.println(ans);
        }
    }
}
