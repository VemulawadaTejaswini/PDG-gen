import java.util.Scanner;
import java.io.IOException;

class Main{
  public static void main(String... args)throws IOException{
    Scanner scan  = new Scanner(System.in);
    String str = scan.nextLine();
    System.out.println(str.substring(0,4) +" "+str.substring(4,12));
  }
}
