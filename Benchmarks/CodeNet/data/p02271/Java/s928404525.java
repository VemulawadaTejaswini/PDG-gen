import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
       int M = 0;
       Scanner scner = new Scanner(System.in);
        int T = 0;
        int n = scner.nextInt();
        int[] S = new int[n];
        for (int i=0; i<n; i++) {
            S[i] = scner.nextInt();
        }
        int f = scner.nextInt();
        for(int i = 0; i<f; ++i){
         int b = scner.nextInt();
        
       
       
       if(sSearch(S,b)){
                 System.out.println("yes");
             }else{
                 System.out.println("no");
             }

         }
      }
         public static Boolean sSearch(int[] a, int b){
        
        Boolean res=false;
        
        for(int j=0; j<a.length; ++j){
            if(seSearch(a,b,j)){
                res=true;
                break;
                
                
               }
        }
        return res;
    }

    public static Boolean seSearch(int[] a, int b,int k){
   
    if(b==0){
            return true;
        }else if(k>=a.length){
            return false;
        }
        
        
    
Boolean res=seSearch(a,b,k+1)||seSearch(a,b-a[k],k+1);
return res;

}
}
