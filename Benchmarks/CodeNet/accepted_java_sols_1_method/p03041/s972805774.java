import java.util.*;
 
public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String nk = scanner.nextLine();
    String s = scanner.nextLine();
    int toLowerCaseIdx = Integer.parseInt(nk.split(" ")[1]);
    StringBuilder sb = new StringBuilder(s);
    sb.replace(toLowerCaseIdx-1,toLowerCaseIdx,s.substring(toLowerCaseIdx-1,toLowerCaseIdx).toLowerCase());
    System.out.println(sb);
  }
}