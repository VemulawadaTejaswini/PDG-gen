//問２　2736 渡辺彩子
import java.util.Scanner;
public class Main{
    
    public void solve(){
        Scanner sc=new Scanner(System.in);
        for(int a=0;a<4;a++){
            int ban=sc.nextInt();
            int suu=sc.nextInt();
            switch(ban){
             case 1:
                System.out.println(suu*6000);
                break;
             case 2:
                System.out.println(suu*4000);
                break;
             case 3:
                System.out.println(suu*3000);
                break;
             case 4:
                System.out.println(suu*2000);
                break;
            }
        }

    }
    
 
public static void main(String[]args){ 
        Main obj=new Main();
    obj.solve();
}
}