//問２渡辺彩子
import java.util.Scanner;
public class Main{
    
    public void solve(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int a=0;a<n;a++){
        int x=sc.nextInt();
        int y=sc.nextInt();
        int b=sc.nextInt();
        int p=sc.nextInt();
        
        int kgaku=x*b+y*p;
        
        if(b>=5&&p>=2){
            kgaku=(x*b+y*p)*4/5;
        }else{
            if(b<5){
                b=5;
            }
            if(p<2){
                p=2;
            }
         int waribiki=(x*b+y*p)*4/5;
            
            if(kgaku>waribiki){
                kgaku=waribiki;
            }
        }
     System.out.println(kgaku);
    }
}
public static void main(String[]args){
    Main obj=new Main();
    obj.solve();
}
}

             