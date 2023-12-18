import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int k = sc.nextInt();
    int l = b-a+1;

    int num = a;
    int num2 = b-k;

    if(l <= k*2){
      for(int i = 0 ; i < l ; ++i){
        System.out.println(num);
        num++;
      }
      
    }else if(l > k*2){
      for(int i = 0 ; i < k ; ++i){
        System.out.println(num);
        num++;
      }
      for(int i = l-k ; i < l ; ++i){
        num2++;
        System.out.println(num2);
      }
    }    
  }
}