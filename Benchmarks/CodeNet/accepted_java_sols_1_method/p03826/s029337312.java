import java.util.*;

  class Main{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
  
      int a = sc.nextInt();
      int b = sc.nextInt();
      int x = sc.nextInt();
      int y = sc.nextInt();
      
      int ab = a*b;
      int xy = x*y;
      
      if(ab>xy){
        System.out.println(ab);
      }else{
        System.out.println(xy);
      }
  }
}