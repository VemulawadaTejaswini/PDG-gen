import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int answer = 753;
    for(int i=0;i<s.length()-2;i++){
      answer = Math.min(answer,Math.abs(753-Integer.parseInt(s.substring(i,i+3))));
    }
    System.out.println(answer);
      
  }
  

  
}