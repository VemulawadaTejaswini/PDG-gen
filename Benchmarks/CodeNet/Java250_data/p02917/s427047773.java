import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        int ans = 0;
        int tmp = Integer.parseInt(sc.next());
        int tmp2 = tmp;
        for(int i = 0;i<n;i++){
            tmp = tmp2;
            if(i < n - 1 && i != 0){
                tmp2 = Integer.parseInt(sc.next());
            }
            if(tmp2 > tmp){
                ans += tmp;
            }else{
                ans += tmp2;
            }
        }
        System.out.println(ans);
    }
}