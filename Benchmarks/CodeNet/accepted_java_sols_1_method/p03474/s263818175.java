import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int a = Integer.parseInt(str[0]);
    int b = Integer.parseInt(str[1]);
    boolean flg = true;
    String s = in.readLine();
    for(int i=0; i<a+b+1; i++) {
      if(s.charAt(i)=='-' && i!=a)
        flg = false;
      if(s.charAt(i)!='-' && i==a)
        flg = false;
    }
    System.out.println(flg==true?"Yes":"No");
  }
}