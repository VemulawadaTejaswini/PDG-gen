import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int k = sc.nextInt();
    if(b - a <= k){
      for(int i = a;i <= b;i++){
        System.out.println(i);
      }
    }else{
      for(int i = 0;i < k;i++){
        System.out.println(a + i);
      }
      for(int i = k-1;i >= 0;i--){
        if(a + i != b - i){
          System.out.println(b - i);
        }
      }
    }
  }
}