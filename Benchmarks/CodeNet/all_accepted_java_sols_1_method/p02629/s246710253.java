import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
      long N = scan.nextLong();

      String res = "";
      //Nが0ではない間
      while(N != 0){
          N--;
          res += (char)('a' + (N % 26));
          N /= 26;
      }
      //文字列を反転
      StringBuilder builder = new StringBuilder(res);
      String result = builder.reverse().toString();

      System.out.println(result);
    }
}