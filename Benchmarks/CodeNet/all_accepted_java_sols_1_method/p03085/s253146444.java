import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    switch(s){
      case "A":
        s="T";
        break;
      case "T":
        s="A";
        break;
      case "G":
        s="C";
        break;
      case "C":
        s="G";
        break;
    }
    System.out.println(s);
  }
}