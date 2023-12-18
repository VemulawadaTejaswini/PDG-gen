import java.util.*;

class Main{
  public static void main(String[] a){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    
    if(s.length()%2==1){
      System.out.print("No");
      return;
    }
    
    for(int i=0;i<s.length();i=i+2){
      if(s.charAt(i) != 'h'){
        System.out.print("No");
        return;
      }
      if(s.charAt(i+1) != 'i'){
          System.out.print("No");
          return;
      }
    }
    System.out.print("Yes");
  }
}