import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int a[] = new int[n];
    for(int i = 0 ; i < n ; ++i){
      a[i] = sc.nextInt();
    }
    
    long num1 = 1;
    long num2 = 1;
    
    for(int i = 0 ; i < k ; ++i){
      num2 *= a[i];
    }
      
    
    
    
    for(int i = 1 ; i <= n-k ; ++i){
      num1 = num2;
      num2 = 1;
      for(int j = i ; j < k+i ; ++j){
        num2 *= a[j];
      }
      
      if(num1 < num2){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }
    
  }
}