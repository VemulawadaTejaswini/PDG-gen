import java.util.*;
class Main {
  public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    String s = scanner.next();
    String t = scanner.next();
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    
    String u = scanner.next();
    
    if(u.equals(s)){
      a --;
    }else{
      b --;
    }
      
    System.out.println(a + " " + b);
  }
}