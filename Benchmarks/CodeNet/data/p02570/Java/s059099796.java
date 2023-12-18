import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int d = scan.nextInt();
        int t = scan.nextInt();
        int s = scan.nextInt();
        if(t >= d / s) System.out.println("Yes");
        else System.out.println("No");
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
