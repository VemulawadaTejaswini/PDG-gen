import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  static int[] pp;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String X = sc.next();
    int count1 = (int)X.chars().filter(ch -> ch == '1').count();
    pp = new int[N + 1];
    Arrays.fill(pp, -1);
    pp[0] = 0;
    pp[1] = 1;
    for(int i = 2; i <= N; i++){
      pp[i] = popcount(i);
    }
    for(int i = 0; i < N; i++){
      char[] xx = X.toCharArray();
      int _count1 = count1;
      if(xx[i] == '1'){
        xx[i] = '0';
        _count1--;
      } else {
        xx[i] = '1';
        _count1++;
      }
      BigInteger bi = new BigInteger(new String(xx), 2);
      BigInteger remain = bi.remainder(new BigInteger(String.valueOf(_count1)));
      System.out.println(popcount(remain.intValue()) + 1);
    }
  }

  static private int popcount(int n){
    if(pp[n] != -1){
      return pp[n];
    } else {
      return popcount(n % Integer.bitCount(n)) + 1;
    }
  }
}