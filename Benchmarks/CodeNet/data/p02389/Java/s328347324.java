import java.util.Scanner;
public class Main{
    int a,b,men,syu;
    public void solve(){
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        men = a*b;
        syu = (a*2)+(b*2);
        System.out.println(men+"\t"+syu);
    }
    public static void main(String[] args){
        Main obj = new Main();
        obj.solve();
    }
}