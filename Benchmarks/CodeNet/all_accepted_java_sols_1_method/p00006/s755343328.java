import java.util.Scanner;

class Main{
  public static void main(String[] args){
    String str = new Scanner(System.in).next();
    StringBuffer stb = new StringBuffer(str);
    System.out.println(stb.reverse().toString());
  }
}