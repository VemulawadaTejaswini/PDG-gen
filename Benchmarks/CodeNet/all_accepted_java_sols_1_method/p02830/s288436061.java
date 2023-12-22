import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      String a = scan.next();
      String b = scan.next();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++){
      if(!a.isEmpty()){
          sb.append(a.charAt(i));
      }
      if(!b.isEmpty()){
          sb.append(b.charAt(i));
      }
    }
    System.out.println(sb.toString());
  }
}