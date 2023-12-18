import java.util.*;

class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        System.out.println(scan.nextInt() >= 30 ? "Yes" : "No");
        scan.close();
    }
    public static void main(String[] args){
        new Main().solve();
    }
}
