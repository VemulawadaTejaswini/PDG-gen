//2714 加藤聖弥 問3
import java.util.Scanner;
public class Main{
    int N;
    int x;
    int y;
    int b;
    int p;
   
    
    public void solve(){
        Scanner sc=new Scanner(System.in);
            N=sc.nextInt();
        for(int s=0;s<N;s++){
            x=sc.nextInt();
            y=sc.nextInt();
            b=sc.nextInt();
            p=sc.nextInt();
            int kin=x*b+y*p;
            if(b<5){
                b=5;
            }if(p<2){
                p=2;
            }
            int war=(x*b+y*p)*8/10;
            if(kin>=war){
            System.out.println(war);
            }else{
            System.out.println(kin);
            }
        }
    }
    
    public static void main(String[] args){
        Main obj=new Main();
            obj.solve();
    }
}