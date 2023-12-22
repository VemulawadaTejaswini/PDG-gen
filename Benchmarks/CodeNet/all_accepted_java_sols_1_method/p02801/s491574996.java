import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    char a = scn.next().charAt(0);
    ++a;
    System.out.println(a);
  }
}