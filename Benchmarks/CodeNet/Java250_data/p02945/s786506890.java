import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a =  sc.nextInt();
    int b =  sc.nextInt();
    int answer = 0;
    if(a*b>=(a+b)){
      if(a*b>=(a-b)){
        answer=a*b;
      }else{
        answer=a-b;
      }
    }else{
      if((a+b)>=(a-b)){
        answer = a+b;
      }else{
        answer = a-b;
      }
    }
    System.out.println(answer);
  }
}