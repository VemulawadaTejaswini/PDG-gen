import java.util.Scanner;
public class Main{
    
    public void solve(){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int men=a*b;
        int syu=a+a+b+b;
        System.out.print(men+" "+syu);
        System.out.println();
    }
    
    public static void main(String[] args){
        Main obj = new Main();
        obj.solve();
    }
}