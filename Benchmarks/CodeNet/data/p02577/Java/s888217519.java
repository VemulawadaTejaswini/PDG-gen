import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    // 入力値
    String input = sc.nextLine();

    int sum = 0;
    for (int i=0; i<input.length(); i++) {
      sum += Integer.parseInt(input.substring(i, i+1));
    }

    // 9で割れるか
    int amari = sum % 9;
    String result = amari == 0 ? "Yes" : "No";
    System.out.println(result);
  }
}
