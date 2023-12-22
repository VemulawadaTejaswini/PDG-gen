import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] pn = new int[n+1];

        for (int i = n; i > 0; i--){
            int tmp = i;
            for(int j=2; tmp != 1;){
                if(tmp % j == 0){
                    pn[j]++;
                    tmp /= j;
                } else {
                    j++;
                }
            }
        }
        long result = 1;
        for(int count : pn){
            result = result * (count + 1)% 1000000007;
        }
        System.out.println(result );
    }
}
