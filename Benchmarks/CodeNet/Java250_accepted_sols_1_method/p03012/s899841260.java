import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        /**
         *入力部
         **/
        int n = sc.nextInt();
        int[] w = new int[n];
        int t = 1;
        sc.nextLine();
        int[] s_1=new int[n];
        int[] s_2 =new int[n];
        int min = 0;
        for(int j =0; j < n;j++){
            w[j]=sc.nextInt();
        }
        //どのtでS_1-S_2が最小となるか
        for(int j =0; j < n;j++){
            
        for(int i =0;i < n;i++){
            if(i <= j){
                //s_1を求める
                s_1[j] = s_1[j] +w[i];
            } else {
                s_2[j] = s_2[j] + w[i];
            }
            
        }
        }
        min=Math.abs(s_1[0]-s_2[0]);
        for(int k =0; k < n;k++){
        if(min > Math.abs(s_1[k]-s_2[k])){
            min = Math.abs(s_1[k]-s_2[k]);
        }
        }
        
        System.out.println(min);
    }
}
