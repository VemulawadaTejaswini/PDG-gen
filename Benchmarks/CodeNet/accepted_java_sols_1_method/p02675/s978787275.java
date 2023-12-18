import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String s = sc.next();
    int n = s.length()-1;
    char c = s.charAt(n);
    if(c=='3'){
      System.out.println("bon");
    }
    else if(c=='0' || c=='1' || c=='6' || c=='8'){
      System.out.println("pon");
    }
    else{
      System.out.println("hon");
    }
  }
}
