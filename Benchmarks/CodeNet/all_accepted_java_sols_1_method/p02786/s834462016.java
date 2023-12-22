import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long H = sc.nextLong();
    long answer =0;
    long enmcnt =1;
    while(H!=1){
      answer = answer + enmcnt;
      H=H/2;
      enmcnt=enmcnt*2;
      //System.out.println(answer);
    }
    answer = answer + enmcnt;
    System.out.println(answer);
    
    
    
  }
  

  
}