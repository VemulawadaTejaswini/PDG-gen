import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int x = sc.nextInt();

    if(400 <= x && x <= 599){
      System.out.println(8);
    }else if(600 <= x && x <= 799){
      System.out.println(7);
    }else if(800 <= x && x <= 999){
      System.out.println(6);
    }else if(1000 <= x && x <= 1199){
      System.out.println(5);
    }else if(1200 <= x && x <= 1399){
      System.out.println(4);
    }else if(1400 <= x && x <= 1599){
      System.out.println(3);
    }else if(1600 <= x && x <= 1799){
      System.out.println(2);
    }else if(1800 <= x && x <= 1999){
      System.out.println(1);
    }
    
  }
}