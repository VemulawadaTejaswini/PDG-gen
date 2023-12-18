import java.util.Scanner;
public class Main{
    int x;
    int y;
    int a=0;
    int b=0;
    
    public void solve(){
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        a=x*y;
        b=x*2+y*2;
        System.out.println(a+"　"+b);
    }
    
    public static void main(String[] args){
        Main obj = new Main();
        obj.solve();
    }
}