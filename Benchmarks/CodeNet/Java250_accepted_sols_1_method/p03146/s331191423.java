import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc =new Scanner(System.in);
        int[] a = new int[1000000];
        a[0] = sc.nextInt();        
        int ans = 0;
  
        //計算処理          
        for(int i = 1; i <1000000; i++){
           if(a[i-1] % 2 == 0){
               a[i] = a[i-1]/2;
           }else if(a[i-1] % 2 == 1){
               a[i] = 3*a[i-1] + 1;
           }

            //評価
           for(int j = 0; j < i; j++){
               if(a[j] == a[i]){
                   ans = i+1;
               }
            }
            if(ans != 0)break;
       }
       
       System.out.println(ans);
    }
}
