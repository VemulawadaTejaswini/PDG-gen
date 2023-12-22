import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int ans = 1;
        if(N%K==0) ans = 0;
        System.out.println(ans);
    }
}