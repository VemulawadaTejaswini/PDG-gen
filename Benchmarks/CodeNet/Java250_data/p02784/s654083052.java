import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int n = sc.nextInt();
    int a[] = new int[n];
    for(int i = 0 ; i < n ; ++i){
      a[i] = sc.nextInt();
    }

    int count = 0;
    
    for(int i = 0 ; i < n ; ++i){
      count += a[i];
    }
    
    if(count >= h){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
    
  }
}