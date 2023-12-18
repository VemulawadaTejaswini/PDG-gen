import java.util.*;
public class Main {
    public void solve() {
        Scanner scan = new Scanner(System.in);
       int N = scan.nextInt();
       int X = scan.nextInt();
       int T = scan.nextInt();
       int a;
       if(N%X == 0) a=N/X;
       else a=N/X+1;
       System.out.println(a*T);
        }
        public static void main(String[]args){
            new Main().solve();
        }
    }