import java.util.* ; 
import java.math.*;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
	int n = scan.nextInt();
 	int arr[] = new int[n+1] ;
    for(int i = 1 ;i<= n ; i++){
      arr[i] = scan.nextInt();
    }
    int m = scan.nextInt(); 
    int arr2[] = new int[m+1];
    int arr3[] = new int[m+1];
     for(int i = 1 ;i<= m ; i++){
      arr2[i] = scan.nextInt();
       arr3[i] = scan.nextInt();
    }
    int temp = 0 ;
    for(int i = 1 ; i<= m ;i++){
      temp = arr[arr2[i]] ; 
      arr[arr2[i]] = arr3[i];
      //System.out.println(arr[arr2[i]]);
      int sum = 0 ;
      for(int j = 1 ; j <= n ; j++){
        sum+=arr[j];
      }
      System.out.println(sum);
      arr[arr2[i]] = temp ;  
    }
   
    
    
  }
}
