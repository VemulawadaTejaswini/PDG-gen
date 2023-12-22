import java.io.PrintWriter;
import java.util.Scanner;

class Main{
    private static final Scanner sc = new Scanner(System.in);
    private static final PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] Args){
        while(true){
            final int n = Integer.parseInt(sc.next());
            final int x = Integer.parseInt(sc.next());
            if(n==0&&x==0) break;
            int ans = 0;
            for(int i = 1; i<=n-2; i++){
                for(int j = i+1; j<=n-1; j++){
                    final int k = x-i-j;
                    if(j<k&&k<=n) ans++;
                }
            }
            out.println(ans);
        }
        out.flush();
    }
}