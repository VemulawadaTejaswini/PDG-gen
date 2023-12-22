import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int x=0;
    if(a<=b){
      x=x+b;
      if(a<=b-1){
        x=x+b-1;
      }else{
        x=x+a;
      }
    }else{
      x=x+a;
      if(b<=a-1){
        x=x+a-1;
      }else{
        x=x+b;
      }
    }
    System.out.println(x);
  }
}
