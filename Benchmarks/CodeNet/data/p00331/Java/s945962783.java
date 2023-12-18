import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int sum = scan.nextInt() + scan.nextInt();
        if(sum < 0){
            System.out.println(-1);
        }else if(sum == 0){
            System.out.println(0);
        }else{
            System.out.println(1);
        }
    }
    
    public static void main(String[] args){
        new Main().solve();
    }
}
