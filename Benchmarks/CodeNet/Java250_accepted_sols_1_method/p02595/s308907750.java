import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;
import java.math.BigInteger;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    BigInteger D = scan.nextBigInteger();
    BigInteger X[] = new BigInteger[N];
    BigInteger Y[] = new BigInteger[N];
    int count = 0;
    BigInteger rlt1, rlt2, rlt;
    BigInteger dd = D.multiply(D);
    for (int i = 0;i < N;i++) {
      X[i] = scan.nextBigInteger();
      Y[i] = scan.nextBigInteger();
      rlt1 = X[i].multiply(X[i]);
      rlt2 = Y[i].multiply(Y[i]);
      rlt = rlt1.add(rlt2);
      if (rlt.compareTo(dd)<=0) {
        count += 1;
      }
    }
    System.out.println(count);
  }
}