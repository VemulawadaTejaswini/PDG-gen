import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    
    int a = num/1000;
    int b = (num%1000)/100;
    int c = ((num%1000)%100)/10;
    int d = ((num%1000)%100)%10;
    
    if(a+b+c+d == 7){
      System.out.println(a + "+" + b + "+" + c + "+" + d + "=7");
    }else if(a-b+c+d == 7){
      System.out.println(a + "-" + b + "+" + c + "+" + d + "=7");
    }else if(a-b-c+d == 7){
      System.out.println(a + "-" + b + "-" + c + "+" + d + "=7");
    }else if(a-b-c-d == 7){
      System.out.println(a + "-" + b + "-" + c + "-" + d + "=7");
    }else if(a-b+c-d == 7){
      System.out.println(a + "-" + b + "+" + c + "-" + d + "=7");
    }else if(a+b-c+d == 7){
      System.out.println(a + "+" + b + "-" + c + "+" + d + "=7");
    }else if(a+b-c-d == 7){
      System.out.println(a + "+" + b + "-" + c + "-" + d + "=7");
    }else if(a+b+c-d == 7){
      System.out.println(a + "+" + b + "+" + c + "-" + d + "=7");
    }

  }
}
