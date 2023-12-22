import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int l = sc.nextInt();
    int r[] = new int[n];
    int a[] = new int[n];
    for(int i = 0 ; i < n ; ++i){
      a[i] = l+i;
      r[i] = Math.abs(a[i]);
    }
    int num = 0;
    int min = 1000000000;
    int sum = 0;
    for(int i = 0 ; i < n ; ++i){
      if(min>r[i]){
        min = Math.min(min,r[i]);
        num = i;
      }  
    }
    for(int i = 0 ; i < n ; ++i){
      if(i!=num){
        sum += a[i];
      }  
    }
    System.out.println(sum);
    
  }
}