import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    
    for(int i = 0 ; i < n ; ++i){
      a[i] = sc.nextInt();
    }
    //後ろから
    for(int i = n-1 ; i >= 0 ; i-=2){
      System.out.print(a[i]+" ");
    }
    
    //前から
    if(n%2==1){
      //奇数
      for(int i = 1 ; i < n ; i+=2){
        System.out.print(a[i]+" ");       
      }
    }else{
      //偶数
      for(int i = 0 ; i < n ; i+=2){
        System.out.print(a[i]+" ");
      }

    }

  }
}