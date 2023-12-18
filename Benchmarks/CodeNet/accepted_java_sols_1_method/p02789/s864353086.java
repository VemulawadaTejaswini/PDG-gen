import java.util.*;
import java.io.*;
class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    String[] split = input.split(" ");
    int n = Integer.parseInt(split[0]);
     int m = Integer.parseInt(split[1]);
    
    if(m==n) {
      System.out.println("Yes");
    }
    else {
       System.out.println("No");
    }
  }
}