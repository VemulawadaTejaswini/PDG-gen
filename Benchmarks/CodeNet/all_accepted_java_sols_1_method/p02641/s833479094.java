import java.util.*;
public class Main{
  public static void main(String args[]){
      int i,x,n;
      Scanner scn =new Scanner(System.in);
      x=scn.nextInt();
      n=scn.nextInt();
      int[] a= new int[n];
      HashMap<Integer,Boolean> map = new HashMap<>();
      for(i=0;i<n;i++){
         a[i]=scn.nextInt();
         map.put(a[i],true);
       }
      int check = x;
      int diff =0;

       while(true){
          if(!map.containsKey(check-diff)){
             System.out.println(check-diff);
             break;
           }
           
          else if(!map.containsKey(check+diff)){
             System.out.println(check+diff);
             break;
           }
           
           else diff++;
        }
   }
}


