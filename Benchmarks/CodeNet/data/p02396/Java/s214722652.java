import java.util.Scanner;

public class Main{
  public static void main(String[] args){
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