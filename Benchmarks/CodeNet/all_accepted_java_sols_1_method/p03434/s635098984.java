import java.util.*;
class Main{

     public static void main(String []args){
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt() ;
      ArrayList<Integer> arr = new ArrayList<>();
      for(int i = 0;i<n ; i++){
          arr.add(scan.nextInt());
      }
      
      Collections.sort(arr,Collections.reverseOrder()) ;
      //System.out.println(arr);
      
      int sum = 0 , sum2 = 0 ;
      for(int i = 0;i<n ; i++){
          if(i%2==0){
             sum+=arr.get(i) ;
              
          }else{
              sum2+=arr.get(i);
          }
      }
      
      System.out.println(Math.abs(sum-sum2));
    }
}