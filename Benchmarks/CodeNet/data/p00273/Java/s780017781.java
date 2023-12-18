import java.util.Scanner;
public class Main{
    int a;   
    int b;
    int n;
    int x;
    int y;
    int kin=0;
    int wari;
    public void solve(){
        Scanner sc=new Scanner(System.in);
        n = sc.nextInt();
        for(int i=0;i<n;i++){
          a = sc.nextInt();
          b = sc.nextInt();
          x = sc.nextInt();
          y = sc.nextInt();
          kin =a*x + b*y;
            
        if(x>=5 && y>=2){
          kin =(a*x + b*y)*4/5;
            
        } else if(x<5){
                x=5;
                }
                if(y<2){
                y=2;
                }
                int wari = (a*x + b*y)*4/5;
                 
                if(kin>wari){
                    kin = wari;
                }
        
            
        System.out.println(kin);
        }
    }
    public static void main(String[] args){
      Main obj=new Main();
        obj.solve();
    }
}