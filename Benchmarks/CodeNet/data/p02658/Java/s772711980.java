import java.util.*;
public class Main {
    public void solve() {
        Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    long[] A = new long[N];
    for(int i=0;i<N;i++)A[i] = scan.nextLong();
    Arrays.sort(A);
    long B = 1;
    for(int i=0;i<N;i++){
        B*=A[i];
        if(B>1000000000000000000L){System.out.println(-1); return;}
    }
    System.out.println(B);

    }

    public static void main(String[] args) {
        new Main().solve();
    }
}