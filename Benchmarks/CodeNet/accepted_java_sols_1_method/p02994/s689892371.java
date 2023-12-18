import java.util.*;
import java.lang.*;

class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();

        int[] apple = new int[N+1];
        int A = 0;
        for(int i = 1 ; i <= N ; i++){
            apple[i] = L+i-1;
            A += apple[i];
        }
        sc.close();
        int ans = Integer.MAX_VALUE;
        int ans2 = 0;
        for(int i = 1 ; i <= N ; i++){
            int B = 0;
            for(int j = 1 ; j < i ; j++){
                B += apple[j];
            }
            for(int k = i+1 ; k <= N ; k++){
                B +=apple[k];
            }
            if(ans > Math.abs(A-B)){
                ans = Math.min(ans, Math.abs(A-B));
                ans2 = B;
            }
        }
        System.out.println(ans2);
    }

}