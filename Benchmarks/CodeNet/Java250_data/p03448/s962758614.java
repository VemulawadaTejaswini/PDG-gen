import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int X = sc.nextInt();
        int ans = 0;
        int c500 = Math.min(A,X/500);
        for(int i=0;i<=c500;i++){
            int c100 = Math.min(B,(X-500*i)/100);
            for(int j=0;j<=c100;j++){
                int remain = X-i*500-j*100;
                if(remain/50<=C) ans += 1;
            }
        }
        System.out.println(ans);
    }
}