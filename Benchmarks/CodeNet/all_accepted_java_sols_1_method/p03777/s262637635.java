import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    String h;
    String d;
    
    if(a.equals("H")){
      if(b.equals("H")){
        b = "H";
      }else{
        b = "D";
      }
    }else{
      if(b.equals("H")){
        b = "D";
      }else{
        b = "H";
      }
    }
    
    System.out.println(b);
    
  }
}