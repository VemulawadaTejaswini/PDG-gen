import java.util.Scanner;
public class Main{
public void solve(){
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int h=x/3600;
    int m=(x-3600*h)/60;
    int s=(x-3600*h-60*m);
    
    System.out.println(h+":"+m+":"+s);
}
    public static void main(String[]args){
        Main obj=new Main();
        obj.solve();
    }
}

    