import java.util.Scanner;
    public class Main{
    int a,b,i;
    public void solve(){
        for(i=0;i<=7;i++){
            a = sc.nextInt();
            b = sc.nextInt();
        }
        for(int j=0;j<=7;j++){
            System.out.println(a-b);
        }
    }
    public static void main(String[] args){
            Main obj= new Main();
            obj.solve();
    }
    }
}