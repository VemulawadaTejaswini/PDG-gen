import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int nInt = sc.nextInt();

    String nString = String.valueOf(nInt);
    
    String first = nString.substring(0,1);
    if (first.equals("1")) {
        first = "9";
    } else {
        first = "1";
    }
    
    String second = nString.substring(1,2);
     if (second.equals("1")) {
        second = "9";
    } else {
        second = "1";
    }
    
    String third = nString.substring(2,3);
     if (third.equals("1")) {
        third = "9";
    } else {
        third = "1";
    }
    
    System.out.println(first + second + third);
  }
}