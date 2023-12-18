import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    char alpha = scan.next().charAt(0);
    int code = (int)(alpha);
    if (65<=code && code<=90){
      System.out.println("A");
    }else{
      System.out.println("a");
    }
  }
}
