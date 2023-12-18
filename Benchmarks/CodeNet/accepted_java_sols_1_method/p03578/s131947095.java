import java.util.*;

public class Main {               
    
  public static void main(String[] args) {     
     Scanner sc = new Scanner(System.in);
      
     int N = sc.nextInt();
     
     HashMap<Integer,Integer> map = new HashMap<>();
     
     for(int i = 0;i < N;i++){
       int a = sc.nextInt();
       if(!map.containsKey((a))){
           map.put(a,1);
       }else{
           map.put(a,map.get(a) + 1);
       }         
     }
     
     int M = sc.nextInt();

     for(int i = 0;i < M;i++){
         int t = sc.nextInt();
         
         if(map.get(t) == null || map.get(t) == 0){
             System.out.println("NO");
             return;
         }
         
         if(map.get(t) > 0){
             map.put(t,map.get(t) -  1);
         }
     }     
     
     System.out.println("YES");
     
  }   
   
}
    