import java.util.*;
 class Main{

     public static void main(String []args){
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt() ;
      int arr[] = new int[n] ;
      
      for(int i = 0; i< n ; i++ ){
          arr[i] = scan.nextInt();
      }
      int count = 0 ;
      while(evenCheck(arr)){
          for(int i = 0 ; i <n ;i++){
              arr[i] = arr[i]/2 ;
          }
          count++;
      }
      System.out.println(count) ;
      
  
     
      
    }
     static boolean evenCheck(int arr[]){
          int count = 0 ;
          for(int i = 0 ; i<arr.length ; i++){
              if(arr[i]%2 != 0 ){
                  return false ;
              }
          }
          return true ;
      }
}