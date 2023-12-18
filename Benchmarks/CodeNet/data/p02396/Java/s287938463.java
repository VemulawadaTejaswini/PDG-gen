import java.util.Scanner;
import java.io.IOException;
import java.io.*;

public class Main{
  public static void main(String[] args)throws NumberFormatException, IOException{
    int i = 1;
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    while( x != 0 ){
    Scanner in = new Scanner(System.in);
    x = in.nextInt();
    System.out.println("Case "+i+": "+x+"");
    i++;
       
   }
  }
}