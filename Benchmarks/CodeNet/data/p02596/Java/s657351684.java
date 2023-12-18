import java.io.*;
import java.math.BigInteger;
class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BigInteger k = new BigInteger(br.readLine().trim());
    int count=1;
    String a = "7";
    while(true){
      BigInteger b = new BigInteger(a);
      if((b.mod(k)).equals(BigInteger.ZERO)){
        System.out.println(count);
        break;
      }
      else{
        a = String.valueOf(b);
        a = a + '7';
      }
      count++;
      if(count > 100000){
        System.out.println(-1);
        break;
      }
    }
  }
}