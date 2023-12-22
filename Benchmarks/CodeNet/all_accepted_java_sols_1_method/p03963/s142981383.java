import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long ans = 1;
        for(int i = 0; i < n; i++){
            if(i == 0){
                ans *= k;
            }else{
                ans *= k-1;
            }
        }
        System.out.println(ans);
    }
}
