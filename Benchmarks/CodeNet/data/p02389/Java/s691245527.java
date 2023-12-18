import java.util.Scanner;
public class Main{
    int x;
    int y;
    
    public void solve(){
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println((x*y)+" "+(x*2+y*2));
    }
    
    public static void main(String[] args){
        Main obj = new Main();
        obj.solve();
    }
}