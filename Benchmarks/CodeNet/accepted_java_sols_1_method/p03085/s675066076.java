import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char n = sc.next().charAt(0);
    if(n == 'A'){
      System.out.println("T");
    }else if(n == 'G'){
      System.out.println("C");
    }else if(n == 'T'){
      System.out.println("A");
    }else{
      System.out.println("G");
    }
  }
}