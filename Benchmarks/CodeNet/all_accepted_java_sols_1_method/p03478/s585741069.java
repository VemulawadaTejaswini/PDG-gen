import java.util.*;
class Main{

     public static void main(String []args){
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt() ;
      int a = scan.nextInt() ;
      int b = scan.nextInt() ;
      int sum = 0;
      
      for(int i = 1 ; i<=n; i++){
          String s = Integer.toString(i);
          
          char[] c = s.toCharArray();
          int [] arr = new int[c.length];
          int sm = 0 ;
         for(int j = 0 ; j<c.length ; j++){
              arr[j]= Character.getNumericValue(c[j]) ;
              sm+=arr[j] ;
          }
          //System.out.println(sm);
          if(sm>=a && sm<=b){
              //System.out.println(i);
              sum+=i;
          }
      }
      System.out.println(sum);
      
     
      
    }
}