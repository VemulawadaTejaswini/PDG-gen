import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc =new Scanner(System.in);
        int S = sc.nextInt();        
        int[] num = new int[1000000];
        int ans = 0;
        num[0] = S;

        //計算処理          
        for(int i = 1; i <1000000; i++){
           if(S % 2 == 0){
               num[i] = S/2;
               S = S/2;
           }else if(S % 2 == 1){
               num[i] = 3*S + 1;
               S = 3*S + 1;
           }

            //評価
           for(int j = 0; j < i; j++){
               if(num[j] == num[i]){
                   ans = i+1;
               }
            }

            if(ans != 0){
                break;
            }
       }
       
       System.out.println(ans);
    }
}
