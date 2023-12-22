import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        long K = sc.nextLong();
        int n = S.length();
        if(n == 1){
            System.out.println(S);
        }else{
             String[] a = new String[n];
            a = S.split("");
            int[] b = new int[n];
            for(int i = 0; i < n; i++){
                b[i] = Integer.parseInt(a[i]);
            }
            int count = 0;
            int ans = 0;
            for(int i = 0; i < K; i++){
                if(b[i] != 1){
                    ans = b[i];
                    break;
                }else{
                    count ++;
                }
                if(count >= K){
                    ans = 1;
                    break;
                }
            }
            System.out.println(ans);
        }
       
    }
}
