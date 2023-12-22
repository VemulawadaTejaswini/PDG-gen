import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] A = new long[3*n];
        for(int i=0;i<3*n;i++) A[i]=sc.nextLong();
        Arrays.sort(A);
        long ans = 0;
        for(int j=3*n-2;j>=n;j-=2){
            ans += A[j];
        }
        System.out.println(ans);
    }
}
