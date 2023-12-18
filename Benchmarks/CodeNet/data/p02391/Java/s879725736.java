import java.util.Scanner;
public class Main{
    public void solve(){
    Scanner sc=new Scanner(System.in);
        
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        
        if(a<b){
         System.out.println("a<b");
        }else if(a>b){
            System.out.println("a>b");
        }else if(a==b){
            System.out.println("a==b");
        }
    }
    public static void Main(String[]args){
    Main obj=new Main();
    obj.solve();
}
}