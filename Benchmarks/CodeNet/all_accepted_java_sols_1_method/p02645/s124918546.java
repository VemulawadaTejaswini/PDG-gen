import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String name = sc.next();
    String nickname = name.substring(0,3); //0 included 3 not included
    System.out.println(nickname);
  }
}
