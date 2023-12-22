import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        sc.close();
        int ans = 0;
        for(int i = 1; i <= n; i++){ 
            if(i <= k){
                ans = ans + x;
            }else{
                ans = ans + y;
            }
        }
        System.out.println(ans);
    }
}