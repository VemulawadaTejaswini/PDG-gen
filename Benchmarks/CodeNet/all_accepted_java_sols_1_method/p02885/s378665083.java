import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int answer = 0;
    
    if(2*b>=a){
      answer=0;
    }else{
      answer = a-2*b;
    }
    System.out.println(answer);
  }
  

  
}
