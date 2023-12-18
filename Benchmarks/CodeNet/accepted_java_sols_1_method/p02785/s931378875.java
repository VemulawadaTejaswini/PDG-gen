import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        long ans = 0;
        int[] H = new int[N];
        for(int i=0;i<N;i++){
            H[i]=scan.nextInt();
        }
        Arrays.sort(H);
        for(int i=0;i<N-M;i++){
            ans+=H[i];
        }
        System.out.println(ans);
    }
}
