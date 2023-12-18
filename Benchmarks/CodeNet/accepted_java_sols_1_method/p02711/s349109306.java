import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    char a = A.charAt(0);
    char b = A.charAt(1);
    char c = A.charAt(2);;
    if(a== '7' || b== '7' || c== '7'){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}

