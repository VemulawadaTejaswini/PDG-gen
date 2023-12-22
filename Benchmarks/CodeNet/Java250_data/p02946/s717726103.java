import java.util.*;
import java.util.Arrays;
public class Main{
    
    public static boolean keta(int k){
        int ans =0;
        while(k>0){
            k /=10;
            ans++;

        }
        if(ans%2==0){
            return false;

        }
        else{
            return true;
        }
    }
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int x = sc.nextInt();
        int [] a = new int [1+2*(k-1)];
        int j = x-k+1;
        for(int i =0;i<1+2*(k-1);i++){
          
            System.out.print(j+" ");
            j++;

        }
        System.out.println();

        
        
    }
   
    
       
    
}