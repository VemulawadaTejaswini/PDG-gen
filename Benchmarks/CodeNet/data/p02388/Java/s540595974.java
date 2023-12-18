//問4 2717 佐久間　翼
import java.util.Scanner;
public class Main{
    
    public void solve(){
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        while(x>=0){
        System.out.println(x*x*x);
            x=sc.nextInt();
    }
    }
    public static void main(String[]args){
        Main obj = new Main();
        obj.solve();
    }
}