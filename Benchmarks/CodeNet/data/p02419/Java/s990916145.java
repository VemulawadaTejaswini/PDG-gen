import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int count = 0;
    String W = sc.next().toLowerCase();
    while(true){
      String s = sc.next();
      if(s.equals("END_OF_TEXT")){
        break;
      }
      else if(s.toLowerCase().equals(W)){
        count++;
      }
    }
    System.out.printf("%d\n", count);
  }
}
