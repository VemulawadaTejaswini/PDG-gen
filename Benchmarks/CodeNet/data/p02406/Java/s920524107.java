import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main{

  public static void main(String[] args) throws IOException {
    try ( BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ) {

      String[] lines = br.readLine().split(" ");
      int n = Integer.parseInt(lines[0]);

      call(n);
    }
  }

  public static void call(int n) {
    int i = 1;
    checkNum(n, i);
    System.out.println("");
  }

  public static void checkNum(int n,int i) {
    int x = i;
    if( x % 3 == 0){
      System.out.print(" " + i);
      endCheckNum(n,i);
    } else include3(n,i,x);
  }

  public static void include3(int n,int i,int x){
    if( x % 10 == 3) {
      System.out.print(" " + i);
    }
    x /= 10;
    if(x != 0) include3(n,i,x);
    else endCheckNum(n,i);
  }

  public static void endCheckNum(int n,int i){
    if(++i <= n) checkNum(n,i);
  }
}
