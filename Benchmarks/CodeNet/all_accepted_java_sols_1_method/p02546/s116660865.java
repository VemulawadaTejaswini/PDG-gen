import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String s = sc.next();
    if(s.charAt(s.length()-1)=='s'){
      System.out.println(s+"es");
    }
    else{
      System.out.println(s+"s");
    }
  }
}