import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int answer = 0;
    if(n%111==0){
      System.out.println(n);
    }else{
    answer = (n/111)+1;
    answer = answer * 111;
    System.out.println(answer);
    }
  }
  

  
}