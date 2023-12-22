import java.util.*;
import java.io.*;
import java.math.*;

public class Main{
  public static void main(String[] args)throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    BigDecimal A = new BigDecimal(S[0]);
    BigDecimal B = new BigDecimal(S[1]);
    System.out.println(A.multiply(B).longValue());
  }
}
