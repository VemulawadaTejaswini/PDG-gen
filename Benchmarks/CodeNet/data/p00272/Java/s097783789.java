//2718 佐々木 稜平 問2
import java.util.Scanner;
public class Main{
   
    public void solve(){
        Scanner sc = new Scanner(System.in);
        for(int a =0;a<4;a++){
            int t = sc.nextInt();
            int n = sc.nextInt();
        switch (t){
           case 1:
             System.out.println(n*6000);
             break;
           case 2:
             System.out.println(n*4000);
             break;
           case 3:
             System.out.println(n*3000);
             break;
           case 4:
             System.out.println(n*2000);
             break;
              }   
        }
    }
    public static void main(String[] args){
       Main obj = new Main();
       obj.solve();
    }
}