import java.util.*;
import java.math.*;

class Main{       
   public static void main(String[] args){

     Scanner sc = new Scanner(System.in);  
      
     int N = sc.nextInt();
    
     HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
     
     for(int i = 0;i < N;i++){
         int a = sc.nextInt();
         if(map.containsKey(a)){
             map.put(a,(map.get(a)+1)%2);
         }else{
            map.put(a,1);
         }         
     }
     
     int count = 0;
     for(int key:map.keySet()){
         if(map.get(key) > 0){
             count++;
         }
     }
     
     System.out.println(count);
      
   }
}
        