import java.util.*;
class Main {
  public static void main(String[] args) {
    
   Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int T = scan.nextInt();
    int arr[] = new int[N];
    int arr2[] = new int[N];
    
    for(int i = 0 ; i< N ;i++){
      arr[i] = scan.nextInt();
      arr2[i] = scan.nextInt();
    }
    
    int min = 999999;
    for(int i = 0 ; i<N ; i++){
      if(arr[i]<min && arr2[i]<=T){
        min = arr[i];
      }
    }
    
    if(min == 999999){
      System.out.println("TLE");
    }else{
      System.out.println(min);
    }
    
  }
}
