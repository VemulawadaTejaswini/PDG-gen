import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,l;
        n = sc.nextInt();
        l = sc.nextInt();
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int ans = 0;

        for(int i=1;i<=n;i++){
            sum += l+i-1;
        }
        for(int i=1;i<=n;i++){
            int tmp = 0;
            for(int j=1;j<=n;j++){
                if(i!=j) {
                    tmp += l + j - 1;
                }
            }
            if(Math.abs(min)>Math.abs(sum-tmp)){
                min = sum - tmp;
                ans = tmp;
            }
        }
        System.out.println(ans);
    }
}