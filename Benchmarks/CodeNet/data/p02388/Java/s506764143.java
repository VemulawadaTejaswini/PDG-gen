import java.util.Scanner;
public class Main{
    int x,kei;
    public void solve(){
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        kei = x*x*x;
        System.out.print(kei+"\n");
        
    }
    public static void main(String[] args){
        Main obj = new Main();
        obj.solve();
    }
}