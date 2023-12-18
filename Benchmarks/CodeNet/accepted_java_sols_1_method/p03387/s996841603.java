import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int a = Integer.parseInt(str[0]);
    int b = Integer.parseInt(str[1]);
    int c = Integer.parseInt(str[2]);
    int sum = a+b+c;
    int max = Math.max(Math.max(a,b),c);
    int min = Math.min(Math.min(a,b),c);
    int middle = sum-max-min;
    int count = 0;
    count = max - middle;
    min += count;
    count += (max-min)/2;
    if((max-min)%2==1)
      count+=2;
    System.out.println(count);
  }
}