import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String head = "";
    if(N<1000){
      head="ABC";
    }else{
      head="ABD";
      N=N-999;
    }
    if(N<10){
      System.out.print(head);
//      System.out.print("00");
//      System.out.print(N);
    }else if(N<100){
      System.out.print(head);
//      System.out.print("0");
//      System.out.print(N);
    }else{
      System.out.print(head);
//      System.out.print(N);
    }
    
    
      
  }
  

  
}