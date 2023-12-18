import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    Pattern p = Pattern.compile("A.*Z");
    Matcher m = p.matcher(s);
    m.find();
    System.out.println(m.group().length());
  }
}