import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    boolean isC = false;
    if(!S.substring(0,1).equals("A")){
      System.out.println("WA");
      return;
    }
      char d = S.charAt(1);
    if(Character.isUpperCase(d)){
          System.out.println("WA");
          return;
    }
    for(int i=2;i<S.length()-1;i++){
      char c = S.charAt(i);
      if(Character.isUpperCase(c)){
        if(S.substring(i,i+1).equals("C")&&!isC){
          isC=true;
        }else{
          System.out.println("WA");
          return;
        }
      }
    }
    if(!isC){
      System.out.println("WA");
      return;
    }
    char last = S.charAt(S.length()-1);
    if(Character.isUpperCase(last)){
      System.out.println("WA");
      return;
    }
    System.out.println("AC");
    
          
    
  }
  

  
}