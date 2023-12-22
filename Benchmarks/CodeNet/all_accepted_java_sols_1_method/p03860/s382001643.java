import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] strs = br.readLine().split(" ");
    System.out.println(strs[0].substring(0,1) + strs[1].substring(0, 1) + strs[2].substring(0, 1));
  }
}