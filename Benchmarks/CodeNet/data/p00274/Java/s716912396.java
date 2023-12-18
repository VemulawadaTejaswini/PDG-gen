import java.util.Scanner;
public class Main{
    int syu;
    int zan;
    int chak;
    int gokei;
     
    public void solve(){
        Scanner sc = new Scanner(System.in);
        syu = sc.nextInt();
        while(syu!=0){
            gokei = 0;
            chak = 1;
            for(int i=1;i<=syu;i++){
                zan = sc.nextInt();
                if(zan>=2){
                    gokei = gokei+1;
                }
                if(zan>0){
                    chak = chak+1;
                }
            }
             
         
            if(gokei>0){
                System.out.println(chak);
            }else{
                System.out.println("NA");
            }
            syu = sc.nextInt();
        }
    }
    public static void main(String[]args){
        Main obj = new Main();
        obj.solve();
    }
}