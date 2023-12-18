import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int K = s.nextInt();
        int X=s.nextInt();
        long ans=X-(K-1);
        for(int i=0;i<(2*K-1);i++){
           System.out.print(ans);
           System.out.print("\t");
           ans++;
        }
    }
}
