import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    String s = sc.nextLine();
    
    if(s.equals("SSS")){
      System.out.println(0);
    }else if(s.equals("SSR") || s.equals("SRS") || s.equals("RSS") || s.equals("RSR")){
      System.out.println(1);
    }else if(s.equals("RRR")){
      System.out.println(3);
    }else{
      System.out.println(2);
    }
    
    return;

  }
}