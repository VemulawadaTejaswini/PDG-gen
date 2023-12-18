import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.next();
    boolean result = input.endsWith("s");  //末尾が"s"と一致するか判定
    StringBuilder sb = new StringBuilder();
    sb.append(input);
    if(result) sb.append("es");
    else sb.append("s");
    String output = new String(sb);  // "abcdefghi"
    System.out.println(output);
  }
}