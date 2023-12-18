import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<BigInteger> list = new ArrayList<>();
    ArrayList<Boolean> upList = new ArrayList<>();
    BigInteger prev = new BigInteger(sc.next());
    list.add(prev);
    for (int i = 1; i < n; i++) {
      BigInteger a = new BigInteger(sc.next());
      if (prev.compareTo(a) == 0) {
        continue;
      }
      list.add(a);
      upList.add(prev.compareTo(a) < 0);
      prev = a;
    }

    BigInteger result = new BigInteger("1000");
    int kabu = 0;
    for (int i = 0, len = list.size() - 1; i < len; i++) {
      if (upList.get(i)) {
        BigInteger[] bigIntegers = result.divideAndRemainder(list.get(i));
        kabu += bigIntegers[0].intValue();
        result = bigIntegers[1];
      } else if (kabu > 0 && !upList.get(i)) {
        result = result.add(list.get(i).multiply(BigInteger.valueOf(kabu)));
        kabu = 0;
      }
    }
    if (kabu > 0) {
      result = result.add(list.get(list.size() - 1).multiply(BigInteger.valueOf(kabu)));
    }
    System.out.println(result);
  }
}
