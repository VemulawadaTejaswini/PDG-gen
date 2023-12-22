import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    sc.next();
    char[] s = sc.next().toCharArray();

    int count = 0;
    char tmp = ' ';
    for(int i = 0; i < s.length; i++){
      if(tmp != s[i]){
        count++;
        tmp = s[i];
      }
    }
    System.out.println(count);
  }
}
