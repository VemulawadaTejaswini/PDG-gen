import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();
    String b = sc.nextLine();
    int idx = 0;

    if(a.length() > b.length()){
      System.out.println("GREATER");
      System.exit(0);
    }else if(a.length() < b.length()){
      System.out.println("LESS");
      System.exit(0);
    }

//charAt(-1)はout of boundsになるのでifで防ぐ
    while(a.charAt(idx) == b.charAt(idx) && idx < a.length()){
      idx++;
      if(idx == a.length()) break;
    }

    if(idx == a.length()){
      System.out.println("EQUAL");
      System.exit(0);
    }

    if(a.charAt(idx) > b.charAt(idx)){
      System.out.println("GREATER");
    }else{
      System.out.println("LESS");
    }

  }
}