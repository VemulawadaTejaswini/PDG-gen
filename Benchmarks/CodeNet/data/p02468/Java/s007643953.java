
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try {
      String[] strArr = br.readLine().split("\\s");
      BigInteger n = new BigInteger(strArr[0]);
      BigInteger m = new BigInteger(strArr[1]);
      
      System.out.println(n.modPow(m, new BigInteger("1000000007")));
      
    } catch (IOException e) {
      // TODO 自動生成された catch ブロック
      e.printStackTrace();
    }
    
  }

}

