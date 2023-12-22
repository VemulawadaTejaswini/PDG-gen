import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int obs = 2*d+1;
        int ans = 0;
        while(n > 0){
            n -= obs;
            ans++;
        }
        System.out.println(ans);
    }
}