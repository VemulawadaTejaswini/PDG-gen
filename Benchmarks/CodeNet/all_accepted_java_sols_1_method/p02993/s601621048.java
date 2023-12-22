import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String answer = "Good";
    String s = sc.next();
    for(int i=0;i<3;i++){
      if(s.charAt(i)==s.charAt(i+1)){
        answer="Bad";
      }
    }
     System.out.println(answer);    
 
  }
}