import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] w = new int[n];
        
        for(int i = 0; i < n; i++) w[i] = sc.nextInt();
        
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < n-1; i++){ //何個目を指定するか
            int l = 0; //左の総和
            int r = 0; //右の総和
            
            for(int j = i; j >= 0; j--){ //左
                l+=w[j];
            }
            
            for(int j = i+1; j < n; j++){ //右
                r+=w[j];
            }
            
            min = Math.min(min, Math.abs(l - r));
        }
        
        System.out.println(min);
    }
}
