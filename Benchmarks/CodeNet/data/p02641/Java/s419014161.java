import java.util.*;
public class Main{
    public static void main(String[] args){
         int x,n;
         Scanner scn = new Scanner(System.in);
         x = scn.nextInt();
         n = scn.nextInt();
         int[] a = new int[n];
         Hashmap<Integer,Boolean> map = new Hashmap<>();
  
         for(int i=0;i<n;i++){
            a[i]=scn.nextInt();
            map.put(a[i],true);
          }
           
          int diff = 0;
     
          while(1){
             if(!map.containsKey(check-diff)){
                 System.out.println(check-diff);
                  break;
              }
              else if(!map.containsKey(check+diff)){
                 System.out.println(check-diff);
                  break;
              }
              else {
                  diff++;
               }
           }
  }
}