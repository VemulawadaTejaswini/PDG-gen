import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] A = new long[n];
        for(int i=0;i<n;i++){
            A[i]=sc.nextLong();
        }
        int cnt=0;
        for(long w:A){
            if(w%2==1) cnt++;
        }
        String ans = cnt%2==0?"YES":"NO";
        System.out.println(ans);
    }
}
