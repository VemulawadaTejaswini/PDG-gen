import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] A = new long[n];
        long[] B = new long[n];
        for(int i=0;i<n;i++){
            A[i]=sc.nextLong();
            B[i]=sc.nextLong();
        }
        long ans = 0;
        for(int i=n-1;i>=0;i--){
            A[i]+=ans;
            if(A[i]%B[i]==0) continue;
            ans += B[i]-A[i]%B[i];
        }
        System.out.println(ans);
    }
}
