import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String S = scanner.next();
    char[] s = S.toCharArray();
    int money = 700;

    for (int i = 0; i < 3; i++){
      if (s[i] == 'o')
        money += 100;
    }
    System.out.println(money);
  }
}
