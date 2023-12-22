import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next(); 
    
    for(int i = 0; i < 3; i++){
      System.out.print(10 - Character.getNumericValue(a.charAt(i)));
    }
  }
}