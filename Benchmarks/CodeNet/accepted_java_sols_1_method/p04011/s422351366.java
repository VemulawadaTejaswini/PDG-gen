import java.util.*;

  class Main{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
  
      int n = sc.nextInt();
      int k = sc.nextInt();
      int x = sc.nextInt();
      int y = sc.nextInt();
      
      int price = 0;
      
      if(n>k){
        price = x*k + (n - k)*y;
      }else{
        price = x*n;
      }
      
      System.out.println(price);
  }
}