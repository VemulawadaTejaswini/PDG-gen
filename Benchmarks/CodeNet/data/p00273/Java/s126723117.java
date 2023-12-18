import java.util.Scanner;
public class Main{
    int a;
    int b;
    int n;
    int x,y;
    int kin=0;
    public void solve(){
        Scanner sc=new Scanner(System.in);
        n = sc.nextInt();
        for(int i=0;i<n;i++){
        a = sc.nextInt();
        b = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        if(x>=5 && y>=2){
           a=(a*8)/10;
            b=(b*8)/10;
        }
        kin=(a*x)+(b*y);
        System.out.println(n);
        System.out.println(kin);
    }
}

public static void main(String [] args){
    Main obj= new Main();
    obj.solve();
}

}