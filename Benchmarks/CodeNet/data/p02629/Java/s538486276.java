
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Long n = sc.nextLong();

    // 26の指数
    double x = Math.log(n) / Math.log(26);
    // 指数の整数部分
    int integerPart = (int)x;

    Map<Integer, String> map = new HashMap<>();
    map.put(1,"a");
    map.put(2,"b");
    map.put(3,"c");
    map.put(4,"d");
    map.put(5,"e");
    map.put(6,"f");
    map.put(7,"g");
    map.put(8,"h");
    map.put(9,"i");
    map.put(10,"j");
    map.put(11,"k");
    map.put(12,"l");
    map.put(13,"m");
    map.put(14,"n");
    map.put(15,"o");
    map.put(16,"p");
    map.put(17,"q");
    map.put(18,"r");
    map.put(19,"s");
    map.put(20,"t");
    map.put(21,"u");
    map.put(22,"v");
    map.put(23,"w");
    map.put(24,"x");
    map.put(25,"y");
    map.put(26,"z");
    List<String> list = new ArrayList<>(map.values());

    String[] ansArray = new String[integerPart + 1];
    for(int i = 0; i < integerPart + 1 ;i++) {
      long y = n % 26;
      ansArray[integerPart - i] = list.get((int) y - 1);
      n = n/26;
    }
    String ans = String.join("", ansArray);

    System.out.println(ans);
  }
}
