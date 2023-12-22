import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String c = sc.next();
    
    List<String> chars = new ArrayList<String>();
    chars.add("a");
    chars.add("b");
    chars.add("c");
    chars.add("d");
    chars.add("e");
    chars.add("f");
    chars.add("g");
    chars.add("h");
    chars.add("i");
    chars.add("j");
    chars.add("k");
    chars.add("l");
    chars.add("m");
    chars.add("n");
    chars.add("o");
    chars.add("p");
    chars.add("q");
    chars.add("r");
    chars.add("s");
    chars.add("t");
    chars.add("u");
    chars.add("v");
    chars.add("w");
    chars.add("x");
    chars.add("y");
    chars.add("z");
    
    String result = "";
    for (int i = 0; i<chars.size(); i++) {
      String xChar = chars.get(i);
      if (c.equals(xChar)) {
        result = chars.get(i+1);
        break;
      }
    }
    
    System.out.println(result);
  }
}