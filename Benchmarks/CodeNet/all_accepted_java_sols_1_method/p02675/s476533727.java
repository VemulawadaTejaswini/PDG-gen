import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = Integer.parseInt(sc.next()); 
    int B = A % 10;
    if(B==3){
      System.out.println("bon");
    }else if(B==0 || B==1 || B==6 || B==8){
      System.out.println("pon");
    }else{
      System.out.println("hon");
    }
  }
}

