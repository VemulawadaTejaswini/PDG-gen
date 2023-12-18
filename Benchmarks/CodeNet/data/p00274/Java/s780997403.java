//2718 佐々木 稜平 問4
import java.util.Scanner;
public class Main{
    
    public void solve(){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int hozon=1;
        int ichi=0;
        while(n!=0){
            for(int cnt=0;cnt<n;cnt++){
           int k=sc.nextInt();
                if(k>=2){
                   hozon++;
                }else if(k==1){
                   ichi++;
          }
      }
        if(hozon>=2){
            System.out.println(hozon+ichi);        
              }else{
                 System.out.println("NA");
                    }
                hozon=1;
                ichi=0;
                n=sc.nextInt();
                }
            }
    public static void main(String[] args){
       Main obj = new Main();
       obj.solve();
    }
}