import java.awt.geom.Point2D;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
  final static int INF = 1 << 28;
  final static long MOD = 1_000_000_007;
  final static double EPS = 1e-9;
  final static double GOLDEN_RATIO = (1.0 + Math.sqrt(5)) / 2.0;
  Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    new Main().run();
  }

  class Node {
    String value = "";
    HashMap<String, Node> map = new HashMap<>();
  }

  class Ret {
    int index;
    Node node = new Node();
  }

  class RetKey {
    int index;
    String key;
  }

  RetKey parseKey(int index, String str) {
//    debug("PARSE KEY");
//    for (int i = 0; i < str.length(); ++i) {
//      if (str.charAt(i) == '\n') {
//        System.err.print('<');
//      } else {
//        System.err.print(str.charAt(i));
//      }
//    }
//    System.err.println();
//    for (int i = 0; i < index; ++i) {
//      System.err.print(" ");
//    }
//    System.err.println("^");
    StringBuilder sb = new StringBuilder();
    for (; ; ) {
      char c = str.charAt(index);
      if (!Character.isDigit(c) && !Character.isAlphabetic(c)) {
        break;
      }
      sb.append(c);
      ++index;
    }
    RetKey r = new RetKey();
    r.index = index;
    r.key = sb.toString();
    return r;
  }

  Ret parseObj(int index, String str, int indent) {
//    debug("PARSE OBJ");
//    for (int i = 0; i < str.length(); ++i) {
//      if (str.charAt(i) == '\n') {
//        System.err.print('<');
//      } else {
//        System.err.print(str.charAt(i));
//      }
//    }
//    System.err.println();
//    for (int i = 0; i < index; ++i) {
//      System.err.print(" ");
//    }
//    System.err.println("^");
    Ret ret = new Ret();
    if (str.charAt(index) == '\n') {
      ++index;
      int j = 0;
      while (str.charAt(index + j) == ' ') {
        ++j;
      }
      index += j;
      return parseObj(index, str, j);
    } else if (indent > 0) {
      for (; ; ) {
        RetKey key = parseKey(index, str);
        assert str.charAt(key.index) == ':';
        Ret obj = parseObj(key.index + 1, str, 0);
        ret.node.map.put(key.key, obj.node);
        index = obj.index;
        int j = 0;
//        debug(index, str.length());
        while (str.charAt(index + j) == ' ') {
          ++j;
        }
//        debug(indent, j);
        if (indent != j) {
          break;
        }
        index += j;
      }
      ret.index = index;
//      debug("\t\t", "RETURN OBJ : ", ret.node.map.size());
      return ret;
    } else {
      assert str.charAt(index) == ' ';
      ++index;
      StringBuilder sb = new StringBuilder();
      while (str.charAt(index) != '\n') {
        sb.append(str.charAt(index++));
      }
      ++index;
      ret.index = index;
      ret.node.value = sb.toString();
//      debug("\t\t", "RETURN VALUE :", sb.toString());
      return ret;
    }
  }

  Ret parse(int index, String str) {
    Ret ret = new Ret();
    while (index < str.length() - 1) {
//      debug(index);
      RetKey retKey = parseKey(index, str);
      String key = retKey.key;
      index = retKey.index;
//      debug(index, str.charAt(index));
      assert str.charAt(index) == ':';
      ++index;
      Ret obj = parseObj(index, str, 0);
      index = obj.index;
      ret.node.map.put(key, obj.node);
    }
    return ret;
  }

  void run() {
    String q = sc.nextLine();
    StringBuilder sb = new StringBuilder();
    while (sc.hasNext()) {
      sb.append(sc.nextLine());
      sb.append('\n');
    }
    sb.append('\n');
    Ret ret = parse(0, sb.toString());
    String[] a = q.split("\\.");
    Node node = ret.node;
    for (int i = 1; i < a.length; ++i) {
      String key = a[i];
      if (!node.map.containsKey(key)) {
        node = null;
        break;
      }
      node = node.map.get(key);
    }
    if (node == null) {
      System.out.println("no such property");
    } else {
      if (node.value.length() == 0) {
        System.out.println("object");
      } else {
        System.out.println("string \"" + node.value + "\"");
      }
    }
  }

  int ni() {
    return Integer.parseInt(sc.next());
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }

}