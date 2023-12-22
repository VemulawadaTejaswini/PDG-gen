import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int k=a+b;

    if(k%2==0){
      if(k>=0){
        System.out.println(k/2);
      }else{
        System.out.println(-k/2);
      }
    }else{
      System.out.println("IMPOSSIBLE");
    }

  }
}
