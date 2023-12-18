import java.util.Scanner;
class Main{
    int a;
    int b;
    int men;
    public void solve(){
        a = sc.nextInt();
        b = sc.nextInt();
        men = a*b;
    }
    public static void main(String[] args){
        Main obj = new Main();
        obj.solve();
    }
}