import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt();
        int t = scan.nextInt();
        if(n % x == 0){
            System.out.println(n * t / x);
        }else{
            System.out.println((n / x + 1) * t);
        }
        scan.close();
    }

    public static void main(String[] args){
        new Main().solve();
    }
}