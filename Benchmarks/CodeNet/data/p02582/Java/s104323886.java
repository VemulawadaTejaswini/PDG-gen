import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int answer = 0;
    int temp = 0;
    String s = sc.next();
    for(int i = 0; i < s.length(); i++){
      if(s.charAt(i) == 'R') {
        temp++;
      } else {
        answer = Math.max(answer, temp);
        temp = 0;
      }
    }
    System.out.println(Math.max(answer, temp));
  }
}