import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int n = sc.nextInt();
        int m=0;
        int t=1;
        while(n>0){
          if(n%10==1){
            m+=9*t;
        
          }else if(n%10==9){
            m+=t;
           
          }else{
             m+=n%10*t;
            
          }
          n/=10;
          t*=10;
        }
        // 出力
        System.out.println(m);
    }
}
