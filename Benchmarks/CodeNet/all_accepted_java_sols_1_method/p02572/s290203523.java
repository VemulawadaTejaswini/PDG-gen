import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args){
    BigInteger MOD = new BigInteger("1000000007");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    List<BigInteger> a = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      BigInteger tmp = new BigInteger(sc.next());
      a.add(tmp);
    }
    List<BigInteger> sumList = new ArrayList<>();
    for (int i = n - 1; i >= 0; i--) {
      sumList.add(BigInteger.ZERO);
    }
    BigInteger sum = BigInteger.ZERO;
    for (int i = n - 1; i >= 0; i--) {
      sum = sum.add(a.get(i)).remainder(MOD);
      sumList.set(i, sum);
    }
    BigInteger result = BigInteger.ZERO;
    for (int i = 0; i < n - 1; i++) {
      result = result.add(a.get(i).multiply(sumList.get(i + 1)).remainder(MOD)).remainder(MOD);
    }
    System.out.println(result);
  }
}
