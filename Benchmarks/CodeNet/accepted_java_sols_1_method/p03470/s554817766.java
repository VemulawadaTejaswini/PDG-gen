import java.util.*;
class Main{

     public static void main(String []args){
      Scanner scan = new Scanner(System.in);
      int m = scan.nextInt() ;
      int arr[] = new int[m] ;
      ArrayList<Integer> a = new ArrayList<>() ;
      for(int i =0 ;i<m ; i++){
          arr[i] = scan.nextInt() ;
          if(!a.contains(arr[i])){
              a.add(arr[i]) ;
          }
      }
      System.out.println(a.size());
    }
}