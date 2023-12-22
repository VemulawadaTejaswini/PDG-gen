import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int q = sc.nextInt();
    
    int[] a = new int[n];
    
    for(int i = 0 ; i < a.length ; ++i){
      a[i] = k;
    }
   
    while(sc.hasNext()){
      int number = sc.nextInt();
      int next = number - 1;
      a[next] += 1; 
    }
    
    
    
    for(int i = 0 ; i < a.length ; ++i){
      a[i] = a[i] - q;
      if(a[i] > 0){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    } 
  }
}