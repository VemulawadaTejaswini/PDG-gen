import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner scn = new Scanner(System.in);
    String name=scn.next();
    System.out.println(name.substring(0,3));
  }
}