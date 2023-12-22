import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    if(s==111){
      System.out.println(3);
    }else if(s==101||s==11||s==110){
      System.out.println(2);
    }else if(s==0){
      System.out.println(0);
    }else{
      System.out.println(1);
    }
  }
  

  
}