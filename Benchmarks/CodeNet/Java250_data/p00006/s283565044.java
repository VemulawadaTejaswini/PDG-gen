import java.util.*;
public class Main{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    String input = sc.next();
    String output;
    char [] str = input.toCharArray();
    char con;
    for(int i = 0;i < str.length / 2;i++){
      con = str[i];
      str[i] = str[str.length - 1 - i];
      str[str.length - 1 - i] = con;
    }
    System.out.println(String.valueOf(str));
  }
}