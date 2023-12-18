import java.util.Scanner;
public class Main{
    int x;
    int y=0;
    
    public void solve(){
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        y=x*x*x;
        System.out.println(y);
    }
    
    public static void main(String[] args){
        Main obj = new Main();
        obj.solve();
    }
}