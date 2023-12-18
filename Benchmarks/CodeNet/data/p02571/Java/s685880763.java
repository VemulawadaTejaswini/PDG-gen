import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    sc.close();
    int answer = s.length();
    for(int i = 0; i <= s.length() - t.length(); i++){
      int diff = 0;
      for(int j = 0; j < t.length(); j++){
        if(s.charAt(i + j) != t.charAt(j)){
          diff++;
        }
      }
      answer = Math.min(answer, diff);
    }
    System.out.println(answer);
  }
}