import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long ans = 0;
        if(N==1) ans = 1;
        else{
            long[] L = new long[87];
            L[0] = 2L;
            L[1] = 1L;
            for(int i=2;i<=N;i++){
                L[i] = L[i-1]+L[i-2];
            }
            ans = L[N];
        }
        System.out.println(ans);
    }
}
