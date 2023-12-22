import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    int answer =0;
    for(int i =0;i<s.length()-2;i++){
      if(s.substring(i,i+1).equals("A")&&s.substring(i+1,i+2).equals("B")&&s.substring(i+2,i+3).equals("C")){
                 answer=answer+1;
      }
    }
    System.out.println(answer);
    
  }
  

  
}