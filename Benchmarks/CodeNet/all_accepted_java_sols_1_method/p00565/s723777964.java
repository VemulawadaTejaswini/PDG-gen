import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int ans = 0;
        int ans1 = 0;
        for(int i = 0; i < n; i++){
            if(a[i] == 1){
                ans1 ++;
            }else{
                if(ans1 > ans){
                    ans = ans1;
                }
                ans1 = 0;
            }
        }
        System.out.println(Math.max(ans +1, ans1+1));
    }
}

