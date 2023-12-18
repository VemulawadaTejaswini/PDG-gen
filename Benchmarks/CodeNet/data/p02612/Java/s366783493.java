import java.util.*;

class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(n % 1000 != 0 ? 1000 - n % 1000 : 0);
        scan.close();
    }
    
    public static void main(String[] args){
        new Main().solve();
    }
}
