import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    String in=scan.next();
    String[] input=in.split("");
    for(int x=0; x<input.length; x++){
      System.out.print("x");
    }
  }
}