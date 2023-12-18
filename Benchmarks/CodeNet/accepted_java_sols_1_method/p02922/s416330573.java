import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int a = Integer.parseInt(str[0]);
    int b = Integer.parseInt(str[1]);
    int sum = 1;
    int count = a;
    
    if(b==1) {
      System.out.println(0);
      System.exit(0);
    }
    
    for(sum=1; count<b; sum++) {
      count += (a-1);
    }
    
    System.out.print(sum);
  }
}