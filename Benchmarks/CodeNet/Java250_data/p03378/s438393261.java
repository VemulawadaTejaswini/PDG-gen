import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        boolean[] A=new boolean[N];
        Arrays.fill(A, false);
        int M=sc.nextInt();
        int X=sc.nextInt();
        X--;
        for(int i=0;i<M;i++){
            int a=sc.nextInt();
            a--;
            A[a]=true;
        }
        int ans=0;
        for(int i=X;i<N;i++){
            if(A[i]==true)ans++;
        }
        int answer=0;
        for(int i=X;i>=0;i--){
            if(A[i]==true)answer++;
        }
        System.out.println(Math.min(ans, answer));
    }
}